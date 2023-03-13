package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static utils.Browser.driver;

public class SignUp {
    private final static By TITLE_DROPDOWN =  By.id("title");
    private final static By FIRST_NAME =  By.id("forename");
    private final static By SURNAME =  By.name("map(lastName)");
    private final static By TERMS_CHECKBOX =  By.name("map(terms)");
    private final static By JOIN_NOW_BTN = By.id("form");
    private final static By DATE_OF_BIRTH_ERR_MSG =  By.xpath("//label[@for='dob']");

    /**
     * Selects Mr from Tittle dropdown
     */
    public static void selectTitle() {
        WebElement dropDown = driver.findElement(TITLE_DROPDOWN);
        Select title = new Select(dropDown);
        title.selectByValue("Mr");

    }

    /**
     *
     * @param firstName the Firstname you would like to enter
     */
    public static void enterFirstName(String firstName) {
        driver.findElement(FIRST_NAME).sendKeys(firstName);
    }

    /**
     *
     * @param surname the Surname you would like to enter
     */
    public static void enterSurname(String surname) {
        driver.findElement(SURNAME).sendKeys(surname);
    }

    /**
     * Checks the Terms checkbox is selected. If it is not, click on it to select it.
     */
    public static void checkTheTickbox() {
        WebElement termsCheckbox  = driver.findElement(TERMS_CHECKBOX);
        if (!termsCheckbox.isSelected())
            termsCheckbox.click();
    }

    /**
     * Clicks on JOIN NOW button
     */
    public static void clickJoinNowBtn() {
        driver.findElement(JOIN_NOW_BTN).click();
    }

    /**
     * Asserts that the expected message is equals to the actual message.
     * @param expectedMessage The expected message
     * @param onError The message that will appear in case of failure
     */
    public static void verifyDateOfBirthMsg(String expectedMessage, String onError) {
        String actualMessage = driver.findElement(DATE_OF_BIRTH_ERR_MSG).getText();
        Assert.assertEquals(actualMessage, expectedMessage, onError);
    }
}
