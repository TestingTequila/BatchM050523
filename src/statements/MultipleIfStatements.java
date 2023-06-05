package statements;

public class MultipleIfStatements {

    public static void main(String[] args) {

        String browser = "chrome";

        if(browser.equalsIgnoreCase("Chrome"))
        {
            System.out.println("Launch Chrome");
        }
        if(browser.equals("Edge"))
        {
            System.out.println("Launch Edge");
        }
        if(browser.equals("Safari"))
        {
            System.out.println("Launch Safari");
        }
        if(browser.equals("Firefox"))
        {
            System.out.println("Launch Firefox");
        }
        if(browser.equals("IE"))
        {
            System.out.println("Launch IE");
        }
        else
        {
            System.out.println("Please provide correct Browser Type");
        }
    }
}
