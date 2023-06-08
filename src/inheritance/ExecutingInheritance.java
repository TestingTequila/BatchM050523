package inheritance;

public class ExecutingInheritance {

    public static void main(String[] args) {
        A a1 = new A();
        a1.addition(12, 4);

        B b1 = new B();
        b1.subtraction(12, 4);


        C c1 = new C();
        c1.addition(12, 4);
        c1.subtraction(12, 4);
        c1.multiplication(12, 4);

        D d1 = new D();
        d1.addition(12, 4);
        d1.subtraction(12, 4);
        d1.multiplication(12, 4);
        d1.division(12, 4);
    }
}
