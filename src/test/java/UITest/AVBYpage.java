package UITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AVBYpage {
    public static final String url = "https://av.by/";
    public static final String copyright = "/html/body/div[1]/div[2]/div[2]/div[1]/footer/div/p";
    public static final String btnEnterMainPage = "//a[@href='/login']";
    public static final String btnAcceptCoockie =
            "//div[@class='cookie-banner__action']";
    public static final String inputPhoneNumber =
            "//div[1]/input[@name='phone.number']";
    public static final String inputPassword =
            "//input[@name='password'][@type='password'][@autocomplete='current-password']";
    public static final String btnUserPicture =
            "//a[@href='https://av.by/profile/offers'][@class='nav__link']";
    public static final String userName =
            "//h4[@class='nav__dropdown-name']";
    public static final String btnEnterAuthorizationForm =
            "//button[@type='submit'][@class='button button--action']";
    public static final String btnEnterAuthorizationFormDisabled =
            "//button[@type='submit'][@class='button button--action'][@disabled]";
    public static final String messageIncorectLoginOrPassword =
            "//div[@class='error-message']";
    public static final String btnAudi = "//a[@title='Audi']";
    public static final String btnAudiA6 = "//a[@title='A6']";
    public static final String dropDownListGeneration =
            "//button[@name='p-6-0-4-generation']";
    public static final String dropDownListGenerationAudiA6C8 =
            "//div[8]/label[@class='dropdown__card-button']";
    public static final String labelSetPriceFrom =
            "//div[1]/label[@class='richinput-control__box']";
    public static final String labelSetPriceTo =
            "//div[2]/label[@class='richinput-control__box']";
    public static final String dropDownCheckBoxBodyType =
            "//button[@name='p-14-body_type']";
    public static final String dropDownCheckBoxBodyTypeSedan =
            "//li[13]/label/span[@class='checkbox__description']";
    public static final String btnShowResult = "//div[@class='filter__show-result']";
    public static final String listOfResultsForAudiA6C8 =
            "//div[3]/div[1]/div/div[2]/h3/a/span[@class='link-text']";

    WebDriver driver;
    public AVBYpage(WebDriver driver) {
        this.driver = driver;
    }

    public String textCopyright() {
        String copyright = driver.findElement(By.xpath(AVBYpage.copyright)).getText();
        return copyright;
    }

    public AVBYpage clickBtnEnterMainPage() {
        driver.findElement(By.xpath(AVBYpage.btnEnterMainPage)).click();
        return this;
    }

    public AVBYpage clickBtnAcceptCoockie() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnAcceptCoockie))).click();
        return this;
    }

    public AVBYpage inputPhoneNumber(String phoneNumber) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputPhoneNumber))).
                sendKeys(phoneNumber);
        return this;
    }

    public AVBYpage inputPassword(String password) {
        driver.findElement(By.xpath(inputPassword)).sendKeys(password);
        return this;
    }

    public AVBYpage clickBtnUserPicture() {
        WebElement btnUserPicture = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AVBYpage.btnUserPicture)));
        Actions act = new Actions(driver);
        act.moveToElement(btnUserPicture).perform();
        return this;
    }

    public String userName() {
        String userName = driver.findElement(By.xpath(AVBYpage.userName)).getText();
        return userName;
    }

    public AVBYpage clickBtnEnterAuthorizationForm() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath(btnEnterAuthorizationForm))).click();
        return this;
    }

    public AVBYpage btnEnterAuthorizationFormDisabled() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath(btnEnterAuthorizationFormDisabled)));
        return this;
    }

    public String messageIncorectLoginOrPassword() {
        String messageIncorectLoginOrPassword = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath(AVBYpage.messageIncorectLoginOrPassword))).getText();
        return messageIncorectLoginOrPassword;
    }

    public AVBYpage clickBtnAudi() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(By.xpath(btnAudi))).click();
        return this;
    }

    public AVBYpage clickBtnAudiA6() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(By.xpath(btnAudiA6))).click();
        return this;
    }

    public AVBYpage clickDropDownListGeneration() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(By.xpath(dropDownListGeneration))).click();
        return this;
    }

    public AVBYpage clickDropDownListGenerationAudiA6C8() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(By.xpath(dropDownListGenerationAudiA6C8))).click();
        return this;
    }

    public AVBYpage labelSetPriceFrom(String priceFrom) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath(labelSetPriceFrom))).
                sendKeys(priceFrom);
        return this;
    }

    public AVBYpage labelSetPriceTo(String priceTo) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath(labelSetPriceTo))).
                sendKeys(priceTo);
        return this;
    }

    public AVBYpage clickDropDownCheckBoxBodyType() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath(dropDownCheckBoxBodyType))).click();
        return this;
    }

    public AVBYpage clickDropDownCheckBoxBodyTypeSedan() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath(dropDownCheckBoxBodyTypeSedan))).click();
        return this;
    }

    public AVBYpage clickBtnShowResults() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnShowResult))).click();
        return this;
    }

    public String listOfResultsForAudiA6C8() {
        String listOfResultsForAudiA6C8 = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath(AVBYpage.listOfResultsForAudiA6C8))).getText();
        return listOfResultsForAudiA6C8;
    }
}
