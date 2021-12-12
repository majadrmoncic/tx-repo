import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulPollPage extends MainPage{
    public SuccessfulPollPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "input#d-pollLink")
    WebElement pollLink;

    @FindBy (className = "d-pollTitle")
    WebElement pollTitle;

    @FindBy (className = "d-locationName")
    WebElement pollLocation;

    @FindBy (css = ".d-pollDescription .d-content")
    WebElement pollNote;


    public String getPollTitle() {
        return pollTitle.getText();
    }

    public String getPollLocation() {
        return pollLocation.getText();
    }

    public String getPollNote() {
        return pollNote.getText();
    }

    public String getPollLink() {
        String link = pollLink.getAttribute("value");
        return link;
    }
}
