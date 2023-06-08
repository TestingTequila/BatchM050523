package inheritance1;

public class ExecutingInheritance {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start(); // Car / BMA
        bmw.stop();
        bmw.refuel();
        bmw.autoParking();

        // ParentClassName refVariable = new ChildClassName();
       Car c1= new BMW(); // Top/Upcasting
        c1.start();
        c1.stop();
        c1.refuel();









    }
}
