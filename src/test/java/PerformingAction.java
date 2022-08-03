import genericutility.BaseClass;
import io.appium.java_client.AppiumDriver;
import objrepository.LoginPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PerformingAction extends BaseClass
{
    @Test
    public void toPerformAction()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage lPage=new LoginPage(driver);
        lPage.loginToApplication();
    }
}
