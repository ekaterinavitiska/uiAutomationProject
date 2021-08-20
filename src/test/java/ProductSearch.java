import org.junit.Assert;
import org.junit.Test;
import pages.BasketPage;
import pages.SearchResultPage;

public class ProductSearch extends BaseTest{
    BasketPage basketPage = new BasketPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    public final static String product = "cat litter";
    public final static String basketHeader = "Het artikel is toegevoegd aan je winkelwagen";

    @Test
    public void searchProductTest(){
        searchResultPage.searchForProduct(product);
    }
    @Test
    public void emptySearchTest(){
        searchResultPage.emptySearch();
    }

    @Test
    public void addToBasketTest(){
        searchResultPage.addProductToBasket(product);
        Assert.assertEquals(basketPage.getHeaderText(),basketHeader);
        basketPage.closeBasketWindow();
    }

    @Test
    public void checkSearchWorksTest(){
            String product = "little dutch";
            searchResultPage.searchForProduct(product);
            Assert.assertTrue(searchResultPage.elementIsVisible());
    }
}
