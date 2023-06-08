package methodcalling;

public class A {

    //1. CAn we overload static method [ Yes ]
    //2. Can we create private constructors [Yes]
    //3. Can we call non-static methods from other static methods [Yes-> Need object to make this possible]
    //4. Can we call static methods from other non-static methods [Yes-> Can be called directly using class name]
    //5. What is the advantage of builder pattern [ Helps to execute various combinations of executions]
    //6. Define usages of 'this' keyword
          // Setter
          // Constructors
          // Builder pattern

    //7. What are different ways to achieve Encapsulation
         // private variable, public methods [ setter / getter]
         // private variable, constructors as setter / getter
         // private methods accessed within public methods

    static int a;
    static String name;

    private A(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public  static void m1()
    {

    }

    public  static void m2()
    {

    }

    public  static void m3()
    {

    }
}
