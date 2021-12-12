import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends PageObject{
    public MainPage(WebDriver driver) {
        super(driver);
    }



                                            // Locators


    // Header area

    @FindBy(css = "a.LogoLink")
    WebElement logo;

    @FindBy(css = " div button.HeaderWidget-signupButton")
    WebElement signUp;

    @FindBy(css = "div button.HeaderWidget-loginButton")
    WebElement logIn;

    @FindBy(css = "li button.CreatePollMenu-createButton")
    WebElement createDoodle;

    @FindBy(css = "button#onetrust-accept-btn-handler")
    WebElement acceptCookies;


                                                // Methods

    public void acceptCookies() {
        acceptCookies.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div#onetrust-banner-sdk .ot-sdk-row")));
    }

    public void createPoll() {
        createDoodle.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("li button.CreatePollMenu-createButton")));
    }

}
