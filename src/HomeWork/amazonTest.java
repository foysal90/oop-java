package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazonTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/rehanabegom/Desktop/chromedriver");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("Iphone");
        searchInput.sendKeys(Keys.ENTER);

        String cu = driver.getCurrentUrl();
        if (cu.equals("https://www.amazon.com/")){
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }
        driver.quit();

    }
}
