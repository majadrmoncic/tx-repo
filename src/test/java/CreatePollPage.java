import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CreatePollPage extends MainPage {
    public CreatePollPage(WebDriver driver) {
        super(driver);
    }

                                            // Locators

    // Step 1

    @FindBy (css = "h1.d-wizardStepTitle")
    WebElement step1Title;

    @FindBy (id="d-pollTitle")
    WebElement title;

    @FindBy (id="d-pollLocation")
    WebElement location;

    @FindBy (css = ".d-location.d-suggestionText")
    List<WebElement> locationSuggestion;

    @FindBy (id="d-pollDescription")
    WebElement note;

    @FindBy (css = "#d-wizardGeneralInformationNavigationView .d-nextButton")
    WebElement continue1;

    // Step 2

    @FindBy (css = ".d-wizardStepTitle h1.d-wizardStepTitle")
    WebElement step2title;

    @FindBy (id = "d-quickConnectCalendarModal")
    WebElement quickConnectModal;

    @FindBy (css = "")
    WebElement logIn;

    @FindBy (css = "")
    WebElement laterLogin;

    @FindBy (css = ".fc-day-header .d-dayHeaderContent")
    List <WebElement> pickDate;

    @FindBy (css = "#d-wizardOptionsNavigationView .d-nextButton")
    WebElement continue2;

    // Step 3

    @FindBy(css = "#d-wizardSettingsView h1.d-wizardStepTitle")
    WebElement step3title;

    @FindBy (css = "#d-wizardSettingsNavigationView .d-nextButton")
    WebElement continue3;

    // Step 4

    @FindBy(css = " #d-wizardInitiatorView h1.d-wizardStepTitle")
    WebElement step4title;

    @FindBy (id ="d-initiatorName")
    WebElement initiatorName;

    @FindBy (id ="d-initiatorEmail")
    WebElement initiatorEmail;

    @FindBy (id = "d-persistPollButton")
    WebElement finish;


                                             // Methods

    public void step1enterData(String exampleTitle, int optionlocation, String exampleNote) {
        optionlocation = optionlocation - 1;
        title.sendKeys(exampleTitle);
        location.click();
        location.sendKeys("A");
        locationSuggestion.get(optionlocation).click();
        note.click();
        note.sendKeys(exampleNote);
        continue1.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".d-location.d-suggestionText")));
    }

    public void step2enterData() {
        pickDate.get(2).click();
        continue2.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#d-wizardOptionsNavigationView .d-nextButton")));
    }

    public void step3enterData() {
        continue3.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#d-wizardSettingsNavigationView .d-nextButton")));
    }

    public void step4enterData(String name, String email) {
        initiatorName.sendKeys(name);
        initiatorEmail.sendKeys(email);
        finish.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("d-initiatorEmail")));
    }

    public String getStep1Title() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.d-wizardStepTitle")));
        String stepCounter = step1Title.getText();
        return stepCounter;
    }
    public String getStep2Title() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".d-wizardStepTitle h1.d-wizardStepTitle")));
        String stepCounter = step2title.getText();
        return stepCounter;
    }

    public String getStep3Title() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#d-wizardSettingsView h1.d-wizardStepTitle")));
        String stepCounter = step3title.getText();
        return stepCounter;
    }

    public String getStep4Title() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#d-wizardInitiatorView h1.d-wizardStepTitle")));
        String stepCounter = step4title.getText();
        return stepCounter;
    }


}
