import org.junit.jupiter.api.Test;
import config.env_target;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.sql.Driver;
import java.time.Duration;
public class Chart extends env_target{
    @Test
    public void remove_product(){
        //SET DRIVER LOCATION PATH
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //MAXIMIZE DRIVER
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //SET URL
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-button\"]"))
        );
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"))
        );
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"))
        );
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span"))
        );
        driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]"))
        );

        driver.quit();
    }

    @Test
    public void chechout_product(){
        //SET DRIVER LOCATION PATH
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //MAXIMIZE DRIVER
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //SET URL
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-button\"]"))
        );
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"))
        );
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"))
        );
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span"))
        );
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span"))
        );
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Harry");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Maguire");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("3325125");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span"))
        );
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"))
        );






        driver.quit();
    }

    @Test
    public void checkout_empty_product(){
        //SET DRIVER LOCATION PATH
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //MAXIMIZE DRIVER
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //SET URL
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-button\"]"))
        );
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"))
        );
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]"))
        );
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a//*[@id=\"checkout\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("")) //should have a failed message because no item on the chart
        );
        driver.quit();
    }
}
