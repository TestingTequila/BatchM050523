package abstraction;

public abstract class A {

    int a;
    public A()
    {
        System.out.println("This is Constructor");
    }
    public  abstract void addition(int a, int b);

    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public void division(int a, int b) {
        System.out.println(a / b);
    }
}
