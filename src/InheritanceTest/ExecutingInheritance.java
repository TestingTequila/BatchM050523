package InheritanceTest;

public class ExecutingInheritance {

    public static void main(String[] args) {

        A a = new A();
        C c = new C();
        C.m41();
        A a1 = new C(); //[ Upcasting/TopCasting]
        a1.m1();
        a1.m2();
        a1.m3();

        //C c1=(C)new A();   // [DownCasting]
    }
}
