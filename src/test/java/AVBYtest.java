import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AVBYtest {
        WebDriver driver;
        @Before
        public void warmUp() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.navigate().to(AVBYpage.url);
        }
        @Test
        public void testAVBYCopyright() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            WebElement copyright = driver.findElement(By.xpath(AVBYpage.copyright));
            Assert.assertEquals("© 2001, ООО «Автоклассифайд», УНП 192787977, Минск, ул. Кутузова, 15",
                    copyright.getText());
        }
        @Test
        public void testAVBYEnter() {
            WebElement btnEnter = driver.findElement(By.xpath(AVBYpage.btnEnter));
            btnEnter.click();
            WebElement phoneNumber = driver.findElement(By.xpath(AVBYpage.phoneNumber));
            phoneNumber.sendKeys(AVBYvalidUser.phoneNumber);
            WebElement password = driver.findElement(By.xpath(AVBYpage.password));
            phoneNumber.sendKeys(AVBYvalidUser.password);

        }

        @After
        public void tearDown(){
            driver.quit();
        }
}
