package methodcalling;

public class Employee {

    String name;// Ashish
    int age; //25

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    String city;


    public Employee(String name, int age) {
        this("Rohit", 24, "Gurgaon");
//        this.name = name;
//        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
        this.age = 25;
    }

    public int add(int a, int b) {
        System.out.println(" Sum of two numbers");
        int sum = a + b;
        return sum;
    }

    public void getInfo(Employee emp) {
        emp.name = "Gaurav";
        emp.age = 40;
        System.out.println("Name : " + name + " and Age :" + age);
    }


}
