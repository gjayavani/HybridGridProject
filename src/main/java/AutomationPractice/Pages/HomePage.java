package AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    @FindBy(css = "#home-page-tabs")
    WebElement homePageTabs;
    @FindBy(css = ".login")
    WebElement signInLink;
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    public void gotoAuthenticationPage()
    {
        try
        {
            Thread.sleep(15000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        signInLink.click();
    }
    public boolean isUserOnHomePage() {
        return homePageTabs.isDisplayed();
    }

}
