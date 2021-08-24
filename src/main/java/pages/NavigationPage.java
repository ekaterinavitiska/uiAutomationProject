package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigationPage {
    public By categoryBtn = new By.ByXPath("//button[@data-test='category-menu']");
    public By hobbyDropdownItem = new By.ByXPath("//wsp-main-nav-item[@omniture-value='Speelgoed & Hobby']");
    public By poppenItem = new By.ByXPath("//li[@omniture-value='Speelgoed & Hobby:Poppen']");

    HobbyPage hobbyPage = new HobbyPage();
    public HobbyPage openHobbyPage() {
        $(categoryBtn).click();
        $(hobbyDropdownItem).click();
        $(poppenItem).click();
        return hobbyPage;
    }
}