package staticconcept;

public class ExecutingBatch {

    public static void main(String[] args) {
        BatchFiveStudents b1 = new BatchFiveStudents();
        b1.name = "Murtaza";
        b1.age = 25;
        System.out.println(BatchFiveStudents.trainersName);

        BatchFiveStudents b2 = new BatchFiveStudents();
        b2.name = "Asad";
        b2.age = 26;
        System.out.println(BatchFiveStudents.trainersName);
        System.out.println(BatchFiveStudents.addition(12,4));

        BatchFiveStudents b3 = new BatchFiveStudents();
        b3.name = "Sanaa";
        b3.age = 27;
        System.out.println(BatchFiveStudents.trainersName);

        BatchFiveStudents b4 = new BatchFiveStudents();
        b4.name = "Sayed";
        b4.age = 23;
        System.out.println(BatchFiveStudents.trainersName);

    }
}
