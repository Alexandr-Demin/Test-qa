package tests.searchapartments;

import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {

   public void checkIsRedirectToListing(){

       basePage.open("https://realt.by/");

       realtHomePage.enterCountRooms().clickToFind();



    }
}
