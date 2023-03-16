package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fb {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/rehanabegom/Desktop/chromedriver");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc123@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456123");
        driver.findElement(By.name("login")).click();
        driver.quit();
        System.out.println("Test successfully completed");
    }
}
