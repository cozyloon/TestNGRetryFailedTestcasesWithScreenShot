import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleTest {

    SoftAssert softAssert =new SoftAssert();
    @Test
    public void test(){
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).submit();
        boolean app_logo = driver.findElement(By.className("app_logo")).isDisplayed();
        driver.quit();
        softAssert.assertEquals(app_logo,false);
        softAssert.assertAll();

    }
}
