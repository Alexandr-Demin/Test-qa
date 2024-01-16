package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.shiphappens.Autorization;
import pages.shiphappens.ShipHeppensPage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected ShipHeppensPage shipHeppensPage = new ShipHeppensPage(driver);
    protected Autorization autorization = new Autorization(driver);


}
