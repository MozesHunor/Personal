package main.java.ro.scit.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestNavigateCommands {
    WebDriver driver;

    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mozes Hunor\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            navigateCommands();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void navigateCommands() {
        try {
            driver.navigate().to("http://www.emag.ro");
            driver.findElement(By.xpath("/html/body/nav/ul/li[1]/a")).click();
            driver.findElement(By.xpath("/html/body/nav/ul/li[2]/a")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().forward();
            Thread.sleep(2000);
            driver.navigate().refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TestNavigateCommands obj1 = new TestNavigateCommands();
        obj1.invokeBrowser();

    }
}
