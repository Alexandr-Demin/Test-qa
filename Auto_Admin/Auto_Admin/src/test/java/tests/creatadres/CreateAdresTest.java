package tests.creatadres;

import org.testng.annotations.Test;
import tests.base.BaseTest;


public class CreateAdresTest extends BaseTest {
    @Test
    public void createAndDeactivateAdres(){

        basePage.open("http://81.163.27.121:5500/");

        autorization
                .autorizationSuperAdmin();

        shipHeppensPage
                .enterAdres()
                .clickDeactivate();


    }

}
