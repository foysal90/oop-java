package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class facebookTest {
    static String browser;
    static WebDriver driver;

    public static void main(String[] args) {
        setBrowser();
        browserConfig();
        runTest();
    }

    public  static  void setBrowser(){
        browser = "chrome";
    }

    public static void browserConfig(){
        System.setProperty("webdriver.chrome.driver", "/Users/rehanabegom/Desktop/chromedriver");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        driver.get("https://www.facebook.com/");
    }

    public  static void runTest(){



        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc123@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456123");

        driver.findElement(By.name("login")).click();
//        String str = driver.findElement(By.linkText("Facebook")).getText();
//        System.out.println(str);
        driver.close();
        driver.quit();



        System.out.println("Test successfully completed");
    }
}
