package Encapsulation;

public class Company {

    private String empName; // Kerrie
    private double empSalary; // 5000

    public Company(String empName, double empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(double empSalary) {

        this.empSalary = empSalary;

    }

    public String employeeName() {
        System.out.println(!(getEmpName().equals("Kerrie")));
        if (!(getEmpName().equals("Kerrie"))) {
            return getEmpName();

        } else {
            return "Not an employee of IBM";
        }
    }

    public double employeeSalary() {
        if (getEmpSalary() > 10000) {
            return -1;
        } else {
            return getEmpSalary();
        }
    }
}
