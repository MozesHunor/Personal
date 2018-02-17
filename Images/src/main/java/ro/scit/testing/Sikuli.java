package main.java.ro.scit.testing;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;

public class Sikuli {
    JavascriptExecutor jse;
    WebDriver driver;
    Screen myScreen;

    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mozes Hunor\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("http://www.instagram.com");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void searchHome() {
        myScreen = new Screen();
        jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,800)");
        Pattern instaMobile = new Pattern("C:\\Users\\Mozes Hunor\\Desktop\\selenium\\insta_sign.PNG");
        try {
            myScreen.wait(instaMobile, 10);
            myScreen.click();
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }


    }

    public static void main(String[] args) {

        Sikuli obj1 = new Sikuli();
        obj1.invokeBrowser();
        obj1.searchHome();

    }
}
