import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://Main Project Auototest//Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/"); // Старт afa

    }
}