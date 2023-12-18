import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://Main Project Auototest//Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/"); // Старт afa


        WebElement element = driver.findElement(By.xpath("//a[text() = 'Реклама']"));
        element.click();





    }
}