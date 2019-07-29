class Circle implements Runnable {

    public Circle()
    {
        Thread t=new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        int radius=4;
        double area=22/7*(radius*radius);
        System.out.println("Area = "+area);
    }
}
class Threading{

    public static void main(String[] args)
        {
            int radius=4;
            Circle c=new Circle();
            double cir=2*(22/7)*radius;
            System.out.println("Circumference = "+cir);

        }
}
