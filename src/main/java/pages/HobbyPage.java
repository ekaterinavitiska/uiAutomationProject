package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HobbyPage extends BasePage{
public By pageHeader = new By.ByXPath("//h1[@data-test='page-title']");


    public String getPageHeader(){
        return  $(pageHeader).getText();
    }
}
