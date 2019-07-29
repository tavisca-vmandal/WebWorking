package com.tavisca.training.threading;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service= Executors.newFixedThreadPool(2);

        Future<Double> f =service.submit(new AreaOfCircle(4));
        Future<Double> f2 =service.submit(new CircumferenceOfCircle(4));

        System.out.println("area " +f.get());
        System.out.println("circumference "+f2.get());

        service.shutdown();
    }
}

class AreaOfCircle implements  Callable<Double>{

    double radius= 0.0;
    AreaOfCircle(double r)
    {
        radius=r;
    }
    @Override
    public Double call() throws Exception {
        return Math.PI*radius*radius;
    }
}
class CircumferenceOfCircle implements Callable<Double> {

    double radius=0.0;
    CircumferenceOfCircle(double d)
    {
        radius =d;
    }

    @Override
    public Double call() {
        return 2*Math.PI*radius;
    }
}
