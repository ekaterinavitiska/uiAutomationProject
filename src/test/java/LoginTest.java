import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import pages.AccountPage;
import pages.LoginPage;
import pages.Utilities;

public class LoginTest extends BaseTest{

    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    private static String email ;
    private static String password ;
    private static String invalidPassword;
    public static final String welcomeHeader = "Hallo Ekaterina,";
    public static final String invalidLoginText = "De combinatie van e-mailadres en wachtwoord is niet geldig.";

    @Test
    public void successfulLoginTest(){
        loginPage.clickLogin();
        email= Utilities.getPropValueByName("email");
        password = Utilities.getPropValueByName("password");
        loginPage.loginToWebsite(email,password);
        Assert.assertEquals(accountPage.getHeaderText(),welcomeHeader);
    }

    @Test
    public void invalidPassLoginTest(){
        loginPage.clickLogin();
        email= Utilities.getPropValueByName("email");
        invalidPassword = Utilities.getPropValueByName("invalidPassword");
        loginPage.loginToWebsite(email,invalidPassword);
        Assert.assertEquals(loginPage.getAlertText(),invalidLoginText);
    }

}
