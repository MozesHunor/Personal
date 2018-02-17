package main.java.ro.scit.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class UseElementLocatorTehniques {
    WebDriver driver;

    public void invokeBrowser(String url) {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mozes Hunor\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void elementLocatorTehniquesUsingAmazon() {
        try {
            invokeBrowser("http://www.amazon.in");
            driver.findElement(By.linkText("Your Amazon.in")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
            driver.findElement(By.className("nav-input")).click();
            driver.navigate().back();
            driver.findElement(By.partialLinkText("Customer")).click();
            Thread.sleep(1000);
            driver.navigate().back();
            closeBrowser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeBrowser() {
        driver.close();
    }

    public void elementLocatorTehniquesUsingInstagram() {
        try {
            invokeBrowser("http://www.instagram.com");
            driver.findElement(By.name("emailOrPhone")).sendKeys("xxx123");
            Thread.sleep(1000);
            driver.findElement(By.tagName("h1"));
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button._q82jw")).click();

            String windowHandle = driver.getWindowHandle();
            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            driver.switchTo().window(String.valueOf(tabs.get(0)));

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/span/button")).click();
            Thread.sleep(1000);
            driver.navigate().back();
            closeBrowser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UseElementLocatorTehniques obj1 = new UseElementLocatorTehniques();
        // obj1.elementLocatorTehniquesUsingAmazon();
        obj1.elementLocatorTehniquesUsingInstagram();
    }
}
