package day45_Interface.browserTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("www.google.com");

        driver.takeScreenShot();
    }

}
