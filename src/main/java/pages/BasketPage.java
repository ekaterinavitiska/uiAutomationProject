package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage extends BasePage {
    public By headerText = new By.ByXPath("//h5[@class='add-on-page-header__title']");

    public By closeBtn = new By.ByXPath("//div[@class='js_close_modal_window modal__window--close-hitarea']");

    public String getHeaderText() {

        return $(headerText).getText();
    }

    public void closeBasketWindow(){

        $(closeBtn).click();
    }

}
