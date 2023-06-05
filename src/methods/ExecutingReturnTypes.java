package methods;

public class ExecutingReturnTypes {

    public static void main(String[] args) {
        ReturnTypeConcepts rtc = new ReturnTypeConcepts();
        // int total1 =rtc.addition1(12, 8); //void

        //int total2 = rtc.addition2(12, 8); // int

        // String myName1=rtc.fullName1("Jason", "Roger");

        //String myName2 = rtc.fullName2("Jason", "Roger");

//        int marks = rtc.totalMarks(50, 80);
//        if (marks >= 150) {
//            System.out.println("Marks Granted as Appreciation : " + (marks + 10));
//        } else {
//            System.out.println(marks);
//        }

//        double salaryWithoutVaccineBonus = rtc.calculateSalary(4000, 4000);
//        System.out.println("Salary with Vaccine Bonus " + (salaryWithoutVaccineBonus + 100));
        String empName = rtc.employeeName("Kerrie", "Wright");
        System.out.println(empName + " MEDMA");


    }
}
