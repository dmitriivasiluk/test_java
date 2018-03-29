import org.testng.annotations.Test;

public class SampleTest extends BaseTest{

    @Test
    public void LoginFaceit(){
        MainNonAuthorizedWindow mainNonAuthorizedWindow = new MainNonAuthorizedWindow();
        mainNonAuthorizedWindow
                .moveToLogInDialog()
                .setCredentials("dmytrovasyliuk96@gmail.com", "sinhrofazatron3")
                .confirmLogin();
    }
}