import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import pages.AccountPage;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    public static final String email = "test.vitiska@gmail.com";
    public static final String passwrd = "Katya_1234567";
    public static final String invalidPass = "1234567";
    public static final String welcomeHeader = "Hallo Ekaterina,";
    public static final String invalidLoginText = "De combinatie van e-mailadres en wachtwoord is niet geldig.";

    @Test
    public void successfulLoginTest(){
        loginPage.clickLogin();
        loginPage.loginToWebsite(email,passwrd);
        Assert.assertEquals(accountPage.getHeaderText(),welcomeHeader);
    }

    @Test
    public void invalidPassLoginTest(){
        loginPage.clickLogin();
        loginPage.loginToWebsite(email,invalidPass);
        Assert.assertEquals(loginPage.getAlertText(),invalidLoginText);
    }

}
