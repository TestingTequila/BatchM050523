package methods;

public class Maths {

    // WAP to print addition, Subtraction, Multiplication, Division of two integer numbers

    // Class level Variables or Global Variables
    int x;
    int y;

    public void addition() {
        int sum = x + y;
        System.out.println("Addition : " + sum);
    }

    public void subtraction() {
        int diff = x - y;
        System.out.println("diff : " + diff);
    }

    public void multiplication() {
        int product = x * y;
        System.out.println("product : " + product);
    }

    public void division() {
        int divide = x / y;
        System.out.println("division : " + divide);
    }


    public void aLevelEmp() {
        int basic = 3000;
        int travelAllowance = 2000;
        int salary = basic + travelAllowance;
        System.out.println(salary);
    }


}
