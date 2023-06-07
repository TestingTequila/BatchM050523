package methodcalling;

public class ExecutingEmployee {

    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        e1.add(12, 8); // Call by Value

        Employee emp = new Employee("Jason", 30);
        emp.getInfo(emp); // Call by Reference




    }


}
