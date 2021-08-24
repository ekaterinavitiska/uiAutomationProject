import org.junit.Assert;
import org.junit.Test;
import pages.BasePage;
import pages.HobbyPage;
import pages.NavigationPage;

public class CategorySearchTest extends BaseTest{

    private static final String pageHeader = "Poppen";
    NavigationPage navigationPage = new NavigationPage();
    HobbyPage hobbyPage = new HobbyPage();

    @Test
    public void openCategoryTest(){
        navigationPage.openHobbyPage();
        Assert.assertEquals(hobbyPage.getPageHeader(),pageHeader);
    }
}
