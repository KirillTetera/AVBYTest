package UITest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AVBYstep {
    AVBYpage doPage;
    WebDriver driver;

    public AVBYstep(WebDriver driver, AVBYpage doPage) {
        this.driver = driver;
        this.doPage=doPage;
    }

    public AVBYstep testAuthorizationValidUser() {
        doPage.clickBtnEnterMainPage();
        doPage.inputPhoneNumber(AVBYvalidUser.phoneNumber);
        doPage.inputPassword(AVBYvalidUser.password);
        doPage.clickBtnEnterAuthorizationForm();
        doPage.clickBtnUserPicture();
        return this;
    }

    public AVBYstep testAuthorizationWithEmptyFields() {
        doPage.clickBtnEnterMainPage();
        return this;
    }

    public AVBYstep testAuthorizationInvalidUser() {
        doPage.clickBtnEnterMainPage();
        doPage.inputPhoneNumber(AVBYinvalidUser.phoneNumber);
        doPage.inputPassword(AVBYinvalidUser.password);
        doPage.clickBtnEnterAuthorizationForm();
        return this;
    }

    public AVBYstep testCarSelectionForm() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        doPage.clickBtnAudi();
        js.executeScript("window.scrollBy(0,300)");
        doPage.clickBtnAudiA6();
        doPage.clickDropDownListGeneration();
        doPage.clickDropDownListGenerationAudiA6C8();
        doPage.labelSetPriceFrom("40000");
        doPage.labelSetPriceTo("50000");
        doPage.clickDropDownCheckBoxBodyType();
        doPage.clickDropDownCheckBoxBodyTypeSedan();
        doPage.clickBtnShowResults();
        return this;
    }
}
