package pages.shiphappens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Autorization extends ShipHeppensPage {
    public Autorization(WebDriver driver) {
        super(driver);
    }

    By userName = By.xpath("//input[@id= 'username']");
    By password = By.xpath("//input[@id= 'password']");
    By enterLogin = By.xpath("//button[@type= 'submit']");

    public Autorization autorizationSuperAdmin() {
        driver.findElement(userName).click();
        driver.findElement(userName).sendKeys("sadmin");

        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123456");

        driver.findElement(enterLogin).click();

        return this;



    }


}
