package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainUrl extends ParentPage {
    @FindBy(xpath = "(.//input[@type='email'])")
    private WebElement enterLogin;
    @FindBy(xpath = "(.//input[@type='password'])")
    private WebElement enterPass;
    @FindBy(xpath = "(.//input[@value='Log In'])")
    private WebElement logButton;
    @FindBy(xpath = ".//div[@id='logoutMenu']")
    private WebElement logo;

    @FindBy(xpath = ".//a[@href]")
    private WebElement linkLocator;

    public MainUrl(WebDriver webDriver) {
        super(webDriver);
    }

    public void openLoginPage() {

        open("https://www.facebook.com/"
        );
        logger.info("1.1 -Url opened in MainUrl ");
    }

    public void openWikipedia() {

        open("https://en.wikipedia.org/wiki/Main_Page");
        logger.info(" Url opened in MainUrl ");
    }


    public void collectAllLinks() {
        actionsWithElements.getTextWithLink(linkLocator);

        logger.info("2.2 collectAllLinks");

    }


    public void enterLoginToInput(String login) {
        actionsWithElements.enterText(enterLogin, login);

    }

    public void enterPasswordToInput(String password) {
        actionsWithElements.enterText(enterPass, password);

    }

    public void clickOnSubmitButton() {

        actionsWithElements.clickButton(logButton);
    }

    public boolean checkLogo() {
        logger.info(" 2 - righLogo - isElementPresent Metod in HomePage");
        return
                actionsWithElements.isElementPresentMetod(logo);
    }
}
