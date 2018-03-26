import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{

    @Test
    public void VerifyDouTitle(){
        String title = driver.getTitle();
        Boolean isTitleCorrect = title.toLowerCase().contains("dou");
        Assert.assertTrue(isTitleCorrect);
    }
}