import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MainNonAuthorizedWindow {
    @FindBy(className = "btn btn-ghost-gray hidden-xs")
    private WebElement logInButton;

    public LoginDialog moveToLogInDialog(){
        logInButton.click();
        return new LoginDialog();
    }
}
