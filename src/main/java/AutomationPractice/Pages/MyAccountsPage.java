package AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountsPage extends BasePage
{
    @FindBy(css = ".info-account")
    WebElement accountInfo;
//@FindBy(css = ".myaccount-link-list")
//    WebElement myAccountLinks;
    @FindBy(css = ".account")
    WebElement accountName;
    public MyAccountsPage()
    {
        PageFactory.initElements(driver,this);
    }
    public boolean isUserOnMyAccountPage()
    {
        return accountInfo.isDisplayed();
    }
    public String getAccountName()
    {
        return accountName.getText();
    }
}
