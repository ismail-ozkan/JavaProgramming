package day38_Inheritance.tasks.browserTask;

public class FirefoxBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing firefox browser");
    }
}
