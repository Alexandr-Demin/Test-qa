package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import org.testng.Assert;

public class RealtListingPage extends BasePage {


    public RealtListingPage(WebDriver driver) {
        super(driver);
    }
    private final By card = By.xpath("//div[@class = 'cursor-pointer w-full h-full']");

    public RealtListingPage checkCountCards(){
        waitElementIsVisible(driver.findElement(card));

        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 30);
        return this;
    }
}
