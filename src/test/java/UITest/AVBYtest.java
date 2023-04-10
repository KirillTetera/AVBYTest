package UITest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AVBYtest {

    WebDriver driver;
    AVBYpage doPage;
    AVBYstep doStep;

    @Before
    public void warmUp() {
        driver = new ChromeDriver();
        doPage = new AVBYpage(driver);
        doStep = new AVBYstep(driver, doPage);
        driver.manage().window().maximize();
        driver.navigate().to(AVBYpage.url);
        doPage.clickBtnAcceptCoockie();
    }

    @Test
    public void testAVBYCopyright() {
        Assert.assertEquals("© 2001, ООО «Автоклассифайд», УНП 192787977, Минск, ул. Кутузова, 15",
                doPage.textCopyright());
    }

    @Test
    public void testAuthorizationValidUser() {
        doStep.testAuthorizationValidUser();
        Assert.assertEquals("Кирилл", doPage.userName());
    }

    //Тест нужно редактировать. Использовать значение boolean для проверки clicable.
    @Test
    public void testAuthorizationWithEmptyFields() {
        doStep.testAuthorizationWithEmptyFields();
        Assert.assertEquals(doPage.btnEnterAuthorizationFormDisabled(),
                doPage.btnEnterAuthorizationFormDisabled());
    }

    @Test
    public void testAuthorizationInvalidUser() {
        doStep.testAuthorizationInvalidUser();
        Assert.assertEquals("Неверный телефон или пароль. Если забыли пароль, восстановите его",
                doPage.messageIncorectLoginOrPassword());
    }

    @Test
    public void testCarSelectionForm() {
        doStep.testCarSelectionForm();
        Assert.assertEquals("Audi A6 C8", doPage.listOfResultsForAudiA6C8());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
