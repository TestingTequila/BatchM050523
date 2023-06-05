package staticconcept;

public class BatchFiveStudents {

    String name;
    int age;
    static final String trainersName = "Ashish";

    public static int addition(int a, int b) {
        int sum = a + b;
        System.out.println(a + b);
        return sum;
    }

    public static double addition1(int a, double b) {
        double sum = a + b;
        System.out.println(a + b);
        return sum;
    }
}
