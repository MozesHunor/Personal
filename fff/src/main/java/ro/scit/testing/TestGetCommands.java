package main.java.ro.scit.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestGetCommands {
    WebDriver driver;

    public void invokeBrowser() {
        try {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mozes Hunor\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            getCommands();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getCommands() {
        try {
            driver.get("http://www.amazon.in");
            String titleOfPage = driver.getTitle();
            System.out.println("Title of the page is: " + titleOfPage);
            driver.findElement(By.linkText("Today's Deals")).click();
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL is: " + currentUrl);
            System.out.println("The current pagesource is: " + driver.getPageSource());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        TestGetCommands obj1 = new TestGetCommands();
        obj1.invokeBrowser();

    }
}
