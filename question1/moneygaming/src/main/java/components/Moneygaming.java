package components;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class Moneygaming {
    private final static String LOGIN_PAGE_URL = "https://moneygaming.qa.gameaccount.com/";
    private final static By JOIN_NOW_BUTTON =  By.xpath("//a[@class='newUser green']");
    /**
     * Opens https://moneygaming.qa.gameaccount.com page
     */

    public static void openPage() {
        driver.get(LOGIN_PAGE_URL);
    }

    /**
     * Clicks on JOIN NOW button
     */
    public static void clickJoinNow() {
        driver.findElement(JOIN_NOW_BUTTON).click();
    }
}
