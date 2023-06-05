package oops;

public class MethodOverloadingConcepts {

    public void addition(double a, int b) {
        double sum = a + b;
        System.out.println(sum);
    }

    public void addition(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

    public void addition(int a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

    public void addition(int a, int b) {
        double sum = a + b;
        System.out.println(sum);
    }

    public void addition(int a, int b, int c) {
        double sum = a + b + c;
        System.out.println(sum);
    }

    public void login(String username, String password) {
        System.out.println("Login using " + username + "& " + password);
    }

    public void login(String username, int otp) {
        System.out.println("Login using " + username + "& " + otp);
    }

    public void login(String username, boolean captcha) {
        System.out.println("Login using " + username + "& " + captcha);
    }

    public void login(String username, String password, boolean captcha) {
        System.out.println("Login using " + username + "& " + captcha);
    }

    public void move(String topArrowKey) {
        System.out.println("JUMP UP");
    }

    public void move(String topArrowKey, String leftKey) {
        System.out.println("Shoots");
    }

    public void move(String topArrowKey, String leftKey, int x) {
        System.out.println("It buys some ammunition");
    }
}
