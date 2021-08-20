package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage extends BasePage{
    public By accountHeader = new By.ByXPath("//div[@class=\"c-hero__title\"]");

    public String getHeaderText(){
        return $(accountHeader).getText();
    }
}
