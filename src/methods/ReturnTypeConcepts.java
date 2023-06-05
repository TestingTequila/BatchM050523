package methods;

public class ReturnTypeConcepts {


    public void addition1(int a, int b) {
        int sum = a + b;
        System.out.println("Addition method WITHOUT Return type :" + sum);
    }

    public int addition2(int a, int b) {
        int sum = a + b;
        System.out.println("Addition method WITH Return type :" + sum);
        return sum;
    }

    public void fullName1(String firstName, String lastName) {
        String completeName = firstName + " " + lastName;
    }

    public String fullName2(String firstName, String lastName) {
        String completeName = firstName + " " + lastName;
        return completeName;
    }


    // Any student whose total marks in maths and science is above 150, they will be given addition 10 marks

    public int totalMarks(int mathsMarks, int scienceMarks) {
        int finalMarks = mathsMarks + scienceMarks;
        System.out.println("Total marks in Maths and Science : " + finalMarks);
        return finalMarks;
    }

    // Whatever be the salary of an employee, we are going to credit $100 as vaccination bonus
    public double calculateSalary(double basicSalary, double travelAllowance) {
        double totalSalary = basicSalary + travelAllowance;
        System.out.println(totalSalary);
        return totalSalary;
    }

    public String employeeName(String fName, String lName)
    {
        String completeName = fName + " " + lName;
        return fName;
    }

}
