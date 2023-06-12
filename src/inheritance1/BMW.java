package inheritance1;

public class BMW extends Car {

    // Overriding happens b/w the classes that share Parent-Child Relationship
    @Override
    public void start() {
        System.out.println("BMW----START");

    }

    public void autoParking() {
        System.out.println("BMW --AUTO PARKING");
    }


    //METHOD HIDING
    public  static void billing()
    {
        System.out.println("CAR - BILLING");
    }


    @Override
    public  void payment(String bc)
    {
        System.out.println("BMW payment using " + bc);
    }

    @Override
    public  void payment(String cc, int cvv)
    {
        System.out.println("BMW payment using " + cc + " and CVV is: " + cvv);
    }


    @Override
    public  void engine()
    {
        System.out.println("BMW - ENGINE");
    }

    // Cannot override method with final keyword
//    public  final void running()
//    {
//        System.out.println("CAR- RUNNING");
//    }
}
