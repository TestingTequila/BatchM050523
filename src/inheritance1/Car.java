package inheritance1;

public class Car extends  Vehicle{

    public  void start()
    {
        System.out.println("CAR ----START");
    }

    public  void stop()
    {
        System.out.println("CAR ----STOP");
    }

    public  void refuel()
    {
        System.out.println("CAR ----REFUEL");
    }



    public  final void running()
    {
        System.out.println("CAR- RUNNING");
    }

    public  static void billing()
    {
        System.out.println("CAR - BILLING");
    }

    public static final void display()
    {
        System.out.println("CAR-DISPLAY");
    }

    public  void payment(String bc)
    {
        System.out.println("Car payment using " + bc);
    }

    public  void payment(String cc, int cvv)
    {
        System.out.println("Car payment using " + cc + " and CVV is: " + cvv);
    }

}
