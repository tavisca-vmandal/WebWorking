package com.tavisca.training.threading;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample2 {

    public  static  void  main(String[] args ) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(10);

        List<Future<String>> list=new ArrayList<Future<String>>();

        Callable<String> call=new TestCallable();
        for(int i=0;i<100;i++)
        {
            Future<String> future=service.submit(call);
            list.add(future);
        }

        for (Future<String> f:list) {

            System.out.println(System.currentTimeMillis()+" ::: "+f.get());
            f.get();
        }

        service.shutdown();
    }

}

class TestCallable implements Callable<String>
{

    @Override
    public String call() throws Exception {

        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}
