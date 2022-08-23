package AutomationPractice.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils extends BrowserFactory
{
    WebDriverWait wait = new WebDriverWait(driver,AutomationConstants.TIMEOUT);
    //wait for element clickable
    public void waitForElementClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    //wait for element visible
    public void waitForElementVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //mouse hover actions
    public void moveTo(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
    //mouse hover and click
    public void mouseHoverAndClick(WebElement elementToHover,WebElement elementToClick)
    {
         Actions actions = new Actions(driver);
         actions.moveToElement(elementToHover).click(elementToClick).build().perform();
    }
    public static void setWait()
    {
        try
        {
           Thread.sleep(30000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
