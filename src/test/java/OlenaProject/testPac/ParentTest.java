package OlenaProject.testPac;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    public WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ParentTest() {
    }

    @Before
    public void setUp() {

        File driverPath = new File("../OlenaOliiynykProj/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", driverPath.getAbsolutePath());


        webDriver = new ChromeDriver();
        //webDriver = new EdgeDriver();

        //mainUrl = new MainUrl(webDriver);
        // practice = new Practice(webDriver);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        if (!(webDriver == null)) {
            webDriver.quit();
        }
    }
}
