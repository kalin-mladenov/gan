package negative;

import components.Moneygaming;
import components.SignUp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Browser;

public class JoinNow {

    @BeforeMethod

    public void setup() {
        Browser.openBrowser();
    }
    @AfterMethod

     public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        Browser.quit();
         }
    @Test
     public void dateOfBirth(){
        Moneygaming.openPage();
        Moneygaming.clickJoinNow();
        SignUp.selectTitle();
        SignUp.enterFirstName("Kalin");
        SignUp.enterSurname("Mladenov");
        SignUp.checkTheTickbox();
        SignUp.clickJoinNowBtn();
        SignUp.verifyDateOfBirthMsg("This field is required", "Error: message not found");

        }
}
