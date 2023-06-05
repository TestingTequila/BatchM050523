package statements;

public class IfElseIfStatement {

    public static void main(String[] args) {

        String browser = "IE";
        if(browser.equals("Chrome"))
        {
            System.out.println("Launch Chrome");
        }
        else if (browser.equals("Edge"))
        {
            System.out.println("Launch Edge");
        }
        else if (browser.equals("Safari"))
        {
            System.out.println("Launch Safari");
        }
        else if (browser.equals("Firefox"))
        {
            System.out.println("Launch Firefox");
        }
        else
        {
            System.out.println("Not a valid browser name");
        }
    }
}
