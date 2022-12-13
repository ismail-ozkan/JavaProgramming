package day38_Inheritance.tasks.browserTask;

public class OperaBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing opera browser");
    }


}
