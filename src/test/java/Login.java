import org.junit.jupiter.api.Test;
import config.env_target;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.sql.Driver;
import java.time.Duration;

public class Login extends env_target {
    @Test
    public void main(){
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
        driver.quit();
    }
    @Test
    public void WrongUsername(){
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
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_secret");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"))
        );
        driver.quit();
    }
    @Test
    public void WrongPassword(){
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
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_user");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"))
        );
        driver.quit();
    }
    @Test
    public void EmptyDataInput(){
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
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"))
        );
        driver.quit();
    }
    @Test
    public void EmptyUsername(){
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
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"))
        );
        driver.quit();
    }
    @Test
    public void EmptyPassowrd(){
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
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"))
        );
        driver.quit();
    }
}
