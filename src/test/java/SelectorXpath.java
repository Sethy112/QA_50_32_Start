import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SelectorXpath {
    WebDriver driver = new ChromeDriver();


    @Test
    public void phoneBookTest() {
        driver.manage().window().maximize();
        ;
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");

//    WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        WebElement btnAbout = driver.findElement(By.xpath("//a[@href='/about']"));
        btnAbout.click();
//        "//*[@href='/about']"
//        //*[text()='ABOUT']
        WebElement btnLogin = driver.findElement(By.xpath("//*[text()='LOGIN']"));
        btnLogin.click();

        SelectorsCss.pause(2);

        WebElement fieldEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));

        int i = new Random().nextInt(1000);
        fieldEmail.sendKeys("qaaaaaa"+i+"@gmail.com");
        pausa(2);

        WebElement fieldPassword = driver.findElement(By.xpath("//*[@name='password']"));
        fieldPassword.sendKeys("Password123!");
        pausa(2);
        WebElement btnRegistration = driver.findElement(By.xpath("//*[@name='registration']"));
        btnRegistration.click();
        pausa(2);
        WebElement btnSignOut = driver.findElement(By.xpath("//button[text()='Sign Out']"));
        btnSignOut.click();
        pausa(2);

        List<WebElement> buttons = driver.findElements(By.xpath("//button"));

        System.out.println(buttons);
        System.out.println(buttons.get(1).getText());






    }


    public void pausa(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
