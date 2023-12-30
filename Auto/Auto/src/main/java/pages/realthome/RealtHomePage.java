package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }
    By countRooms = By.xpath("//select[@id = 'rooms']");
    By option2rooms = By.xpath("//select[@id = 'rooms']/option [@value= '2']");
    By findBt = By.xpath("//*[@id=\"residentialInputs\"]/div[1]/form/div[2]/div[2]/a[2]");


    public RealtHomePage enterCountRooms(){
        driver.findElement(countRooms).click();
        driver.findElement(option2rooms).click();
        return this;

    }
    public RealtHomePage clickToFind(){
        driver.findElement(findBt).click();
        return this;
    }
}
