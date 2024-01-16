package pages.shiphappens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ShipHeppensPage extends BasePage{
    public ShipHeppensPage(WebDriver driver) {
        super(driver);
    }
    By btnAdres = By.xpath("//*[@id=\"root\"]/div/section/aside/div/ul/li[9]/a");
    By btnCreateAdres = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/button");
    By btnSave = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/form/div/div/button");
    By btnDeactivate = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div[3]/div[1]/div[2]/div/div/button[2]");
    By textCreator = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div[3]/div[1]/div[2]/div/div/button[1]");


    public ShipHeppensPage enterAdres(){
        driver.findElement(btnAdres).click();
        driver.findElement(btnCreateAdres).click();
        driver.findElement(btnSave).click();
        return this;
    }
    public ShipHeppensPage clickDeactivate(){
        //waitElementVisible(driver.findElement(textCreator));
        driver.findElement(btnDeactivate).click();
        return this;
    }



    }

