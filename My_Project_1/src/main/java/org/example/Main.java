import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\tStart");
        //
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 0 by default
        driver.manage().window().maximize();
        //
        driver.get("https://demo.opencart.com/");
        Thread.sleep(2000); // For Presentation
        System.out.println("\tdemo.opencart.com opened, title = " + driver.getTitle());
        //
        driver.findElement(By.cssSelector("li.list-inline-item a.dropdown-toggle[href='']")).click();
        Thread.sleep(2000); // For Presentation
        System.out.println("\ta.dropdown-toggle.show clicked ");
        //
        driver.findElement(By.cssSelector("a[href*='account/login']")).click();
        Thread.sleep(2000); // For Presentation
        System.out.println("\ta[href*='account/login'] clicked");
        //
        WebElement email = driver.findElement(By.id("input-email"));
        email.click();
        email.clear();
        email.sendKeys("hahaha@gmail.com");
        Thread.sleep(2000); // For Presentation
        System.out.println("\temail typed");
        //
        WebElement password = driver.findElement(By.id("input-password"));
        email.click();
        email.clear();
        email.sendKeys("\tqwerty");
        Thread.sleep(2000); // For Presentation
        System.out.println("\tpassword typed");
        //
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(2000); // For Presentation
        System.out.println("\tbutton login clicked");
        //
        Thread.sleep(4000); // For Presentation
        driver.quit();
        //
        System.out.println("\tDone");
    }
}
