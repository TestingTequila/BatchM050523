package methods;

public class Automation {


    public void launchBrowser(String browserName) {
        if (browserName.equals("Chrome")) {
            System.out.println("Launch Chrome Browser");
        } else if (browserName.equals("Firefox")) {
            System.out.println("Launch Firefox");
        } else if (browserName.equals("Safari")) {
            System.out.println("Launch Safari");
        } else if (browserName.equals("Opera")) {
            System.out.println("Launch Opera");
        } else if (browserName.equals("Edge")) {
            System.out.println("Launch Edge");
        } else {
            System.out.println("Please provide a valid browser name");
        }
    }
}
