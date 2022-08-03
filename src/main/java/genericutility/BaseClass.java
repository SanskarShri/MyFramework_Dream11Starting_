package genericutility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass
{

    public AppiumDriverLocalService service;

    public URL url;
    public AppiumDriver driver;
    public DesiredCapabilities caps = new DesiredCapabilities();



    @BeforeSuite
    public void openDB() {
        System.out.println("open the database");

    }

    @BeforeClass
    public void openServer()
    {
        service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(4728));
        service.start();


    }

    @BeforeMethod
    public void openApp() throws MalformedURLException {
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
        caps.setCapability("appPackage", "com.app.dream11Pro");
        caps.setCapability("appActivity", "com.app.dream11.dream11.SplashActivity");
        url = new URL("http://localhost:4728/wd/hub");
        driver = new AppiumDriver(url, caps);
    }

    @AfterClass
    public void quitApp() {
        System.out.println("Quit app");
        driver.closeApp();
    }

    @AfterSuite
    public void closeDB() {

        System.out.println("close database");
    }

}

