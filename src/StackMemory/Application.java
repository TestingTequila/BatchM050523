package StackMemory;

public class Application {

    public void m1() {
        System.out.println("This is method m1()");
        m2();
    }

    public void m2() {
        System.out.println("This is method m2()");
        m3();
    }

    public void m3() {
        System.out.println("This is method m3()");
        m4();
    }

    public void m4() {
        System.out.println("This is method m4()");
        m1();
    }
}
