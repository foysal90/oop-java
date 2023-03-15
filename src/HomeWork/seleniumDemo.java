package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;


public class seleniumDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/rehanabegom/Desktop/chromedriver");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
//        System.setProperty("webdriver.safari.driver","/Users/rehanabegom/safari/");
//        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.youtube.com/");
//        driver.findElement(By.id("search")).sendKeys("new bangla natok my first love");
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("sweet@hotmail.com");
        driver.findElement(By.id("pass")).sendKeys("1123456");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());
        String u = driver.getCurrentUrl();

        if (u.equals("https://www.facebook.com/")){
            System.out.println("login successfull");
        }else {
            System.out.println("login failed");
        }

//        if (u.equals("https://www.youtube.com/results?search_query=bangla+new+natok+my+first+love")) {
//            System.out.println("Test is passed");
//        } else {
//            System.out.println("Test is failed");
//		}


        }
    }
