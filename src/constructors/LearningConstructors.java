package constructors;

public class LearningConstructors {


    String emailId;
    String password;

    int x; //12
    int y; //4


    static String myCompany;

    public LearningConstructors(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public LearningConstructors(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public LearningConstructors(String emailId, String password, int x, int y) {
        this.emailId = emailId;
        this.password = password;
        this.x = x;
        this.y = y;
    }

    public void addition() {
        if (x >= 10 && y <= 5) {
            System.out.println("ADDITION: " + x + y);
        } else {
            System.out.println("Cant add as per the condition");
        }
    }

}
