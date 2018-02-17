package main.java.ro.scit.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OtherCommands {

    WebDriver driver;

    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mozes Hunor\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get("http://www.yatra.com");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void closeDriver() {

        try {
            driver.close();
            //driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OtherCommands obj1 = new OtherCommands();
        obj1.invokeBrowser();
        obj1.closeDriver();
    }
}
