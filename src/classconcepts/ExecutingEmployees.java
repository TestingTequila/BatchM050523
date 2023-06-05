package classconcepts;

public class ExecutingEmployees {

    public static void main(String[] args) {

        // NameOfTheClassWhoseObjectYouWantTOCreate nameOfObject = new NameOfTheClassWhoseObjectYouWantTOCreate();
        Employee emp1 = new Employee();
        emp1.firstName = "Ashish";
        emp1.age = 30;
        emp1.city = "Delhi";
        emp1.empId = 1234;
        emp1.dept = "QA";

        System.out.println(emp1.firstName + " , " + emp1.age + " , " + emp1.city);
    }
}
