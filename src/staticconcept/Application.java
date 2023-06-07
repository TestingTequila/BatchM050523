package staticconcept;

public class Application {

    // Calling method within method --> Non-Static methods
    public void m1() {
        System.out.println("This is method m1");
    }

    public void m2() {
        System.out.println("This is method m2");
        Application.m5();
    }

    public static void m5()
    {
        System.out.println("This is Static method m5");
    }

    public void m3() {
        System.out.println("This is method m3");
    }

    // Calling method within method --> Static methods
    public static void m4()
    {
        System.out.println("This is Static method m4");
        //m5();
        Application app1 = new Application();
        app1.m1();
    }

    public static void m6()
    {
        System.out.println("This is Static method m6");
    }

    // Calling method within method --> Non-Static method within Static method

    // Calling method within method --> Static method within non-Static method
}
