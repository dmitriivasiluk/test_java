import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginDialog {
    @FindBy(id = "login_email")
    private WebElement userEmail;

    @FindBy(id = "login_password")
    private WebElement password;

    @FindBy(className = "btn btn-primary btn-block btn-fixed-height")
    private WebElement loginAndPlayButton;

    public LoginDialog setCredentials(String email, String password){
        userEmail.sendKeys(email);
        userEmail.sendKeys(password);
        return this;
    }

    public MainAuthorizedWindow confirmLogin(){
        loginAndPlayButton.click();
        return new MainAuthorizedWindow();
    }
}
