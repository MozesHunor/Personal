package main.java.ro.scit.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    WebDriver driver;
    JavascriptExecutor jse;

    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mozes Hunor\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            driver.get("http://www.edureka.co");
            searchCourse();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void searchCourse() throws InterruptedException {

        driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
        driver.findElement(By.id("homeSearchBarIcon")).click();
        jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,800)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"categorylistmain\"]/div[2]/div[2]/ul/li[1]")).click();
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.invokeBrowser();
    }
}
