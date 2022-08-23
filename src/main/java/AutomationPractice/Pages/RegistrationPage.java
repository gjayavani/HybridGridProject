package AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage
{
    @FindBy(css = "#create-account_form")
    WebElement createAccountForm;

    @FindBy(css = "#login_form")
    WebElement signInPanel;

    @FindBy(css = "#email")
    WebElement SignInEmailField;

    @FindBy(css = "#passwd")
    WebElement passwordField;

    @FindBy(css = "#SubmitLogin")
    WebElement loginButton;

    @FindBy(css = ".alert.alert-danger ol li")
    WebElement validationMessagesBlock;

    public RegistrationPage() {
        PageFactory.initElements(driver,this);
    }


    public boolean isUserOnAuthenticationPage() {
        return createAccountForm.isDisplayed();
    }

    public boolean isSignInPanelShown() {
        return signInPanel.isDisplayed();
    }

    public void enterCredentials(String email, String password) {
        SignInEmailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void selectSignIn() {
        loginButton.click();
    }

    public String getErrorMessage() {
        return  validationMessagesBlock.getText();
    }
}
