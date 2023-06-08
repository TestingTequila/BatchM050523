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
}
