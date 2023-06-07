package methodcalling;

public class Employee {

    String name;// Amrita
    int age; //25


    public Employee(String name, int age) {
        this.name = name;
        this.age = 25;
    }

    public int add(int a, int b) {
        System.out.println(" Sum of two numbers");
        int sum = a + b;
        return sum;
    }

    public void getInfo(Employee emp) {
        emp.name = "Amrita";
        emp.age = 25;
        System.out.println("Name : " + name + " and Age :" + age);
    }
}
