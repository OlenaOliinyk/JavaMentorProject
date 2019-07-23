package OlenaProject.testPac;

import org.junit.Test;

public class MainPageTest  extends ParentTest{
    public MainPageTest(){}

    @Test
    public void projectTest(){
        mainUrl.openLoginPage();
        mainUrl.enterLoginToInput("eleniks@gmail.com");
        mainUrl.enterPasswordToInput("---");
        mainUrl.clickOnSubmitButton();
    }
}
