package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage extends BasePage {
    public By addFirstProductToBasket = new By.ByXPath("(//a[@data-button-type='buy'])[1]");
    public By searchedProductTitle = new By.ByXPath("(//div[@class='product-title--inline']//*[contains(text(),'Little Dutch')])[1]");

    public void searchForProduct(String product){
        $(searchField).sendKeys(product);
        $(searchIcon).click();
    }

    public void emptySearch(){
        $(searchIcon).click();
    }

    public void addProductToBasket(String product){
        $(searchField).sendKeys(product);
        $(searchIcon).click();
        $(addFirstProductToBasket).click();
    }

    public String getProductTitleText(){
        return $(searchedProductTitle).getText();
    }

    public boolean elementIsVisible(){
        return $(searchedProductTitle).isDisplayed();
    }


}
