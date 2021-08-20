package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage{
    public By emailField = new By.ByXPath("//input[@id='login_email']");
    public By passwordField = new By.ByXPath("//input[@id='login_password']");
    public By inloggenBtn = new By.ByXPath("//button[@data-test='login-form-submit']");
    public By invalidLoginAlert = new By.ByXPath("//div[@data-test='alert-item']");

    public void clickLogin(){
        $(loginBTN).click();
    }

    public void loginToWebsite(String email,String password){
        $(emailField).sendKeys(email);
        $(passwordField).sendKeys(password);
        $(inloggenBtn).click();
    }

    public String getAlertText(){
        return $(invalidLoginAlert).getText();
    }
}
