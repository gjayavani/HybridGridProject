package AutomationPractice.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory
{
    public static WebDriver driver;
    public static void StartBrowser()
    {
        if(AutomationConstants.REMOTE_BROWSER==true)
        {
          System.out.println("selenium grid is running");
            MutableCapabilities sauceoptions = new MutableCapabilities();
            ChromeOptions browseroptions = new ChromeOptions();
            browseroptions.setExperimentalOption("w3c",true);
            browseroptions.setCapability("platform name","Windows 11");
            browseroptions.setCapability("browser version","88.0.4324.96");
            browseroptions.setCapability("sauce:options",sauceoptions);
            try
            {
                //create remote webdriver object and assign it to driver variable
                driver = new RemoteWebDriver(new URL(AutomationConstants.SELENIUM_GRID_URL),browseroptions);
            }
            catch(MalformedURLException e)
            {
              System.out.println("In Exception");
              e.printStackTrace();
            }
        }
        else
        {
            if(AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox"))
            {
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();
            } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome driver"))
            {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Internet Explorer"))
            {
                WebDriverManager.chromedriver().setup();
                driver = new InternetExplorerDriver();
            }
        }
        driver.get(AutomationConstants.baseURL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void stopBrowser()
    {
        if(driver != null)
        {
            driver.close();
            driver.quit();
        }
    }

    public static WebDriver getDriver()
    {
        if(driver==null)
        {
            BrowserFactory.StartBrowser();
        }
        return driver;
    }
}

