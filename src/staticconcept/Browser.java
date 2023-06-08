package staticconcept;

public class Browser {

    public void launchBrowser() {
        checkOS();
        checkRam();
        checkBrowserVersion();
        System.out.println("launchBrowser : This method will launch browser");
        System.out.println("Whatever");
    }

    private void checkRam() {
        System.out.println("checkRam : This method will check the memory availability");
    }

    private void checkBrowserVersion() {
        System.out.println("checkBrowserVersion: This will check the browser Version");
    }

    private void checkOS() {
        System.out.println("checkOS: This will check the operating System");
    }

}
