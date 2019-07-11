import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Drop {
    @Test
    public void SomeTests() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jira.hillel.it/login.jsp");
        driver.findElement(By.cssSelector("#login-form-username")).sendKeys("skazke91");
        driver.findElement(By.cssSelector("#login-form-password")).sendKeys("samuray9");
        driver.findElement(By.cssSelector("#login-form-submit")).click();
        driver.findElement(By.cssSelector("#browse_link")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("//*[@id=\"admin_main_proj_link_lnk\"]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div[1]/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
        WebElement From=driver.findElement(By.xpath("//*[@id=\"ghx-pool\"]/div/ul/li[1]/div"));
        WebElement To=driver.findElement(By.xpath("//*[@id=\"ghx-pool\"]/div/ul/li[2]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(From, To).build().perform();



    }
}