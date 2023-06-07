package Encapsulation;

public class ExecutingCompany {

    public static void main(String[] args) {
        Company ibm = new Company("Kerrie", 5000);

        System.out.println("EmployeeName : " + ibm.employeeName()+ " and pay a salary of " + ibm.employeeSalary());


    }
}
