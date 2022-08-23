package AutomationPractice.Pages;

import AutomationPractice.Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BrowserFactory
{
      public static WebDriver driver = BrowserFactory.getDriver();
      public  BasePage()
      {
          PageFactory.initElements(driver,this);
      }
      public String getUrl()
      {
          return driver.getCurrentUrl();
      }
      public String getCurrentTitle()
      {
          return driver.getTitle();
      }
}
