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
        pausa(5);
        WebElement btnSignOut = driver.findElement(By.xpath("//button[text()='Sign Out']"));
        btnSignOut.click();
        pausa(2);

        List<WebElement> buttons = driver.findElements(By.xpath("//button"));

        System.out.println(buttons);
        System.out.println(buttons.get(1).getText());
    }
@Test

public void iLcarroXpathTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search ");

        WebElement logIn = driver.findElement(By.xpath("//a[@href='/login?url=%2Fsearch']"));
        logIn.click();
        pausa(2);
//         int r= new Random().nextInt(1000);
        WebElement fieldEmail= driver.findElement(By.xpath("//input[@id='email']"));
        fieldEmail.sendKeys("qa32554@mail.com");
        pausa(3);
        WebElement fieldPassword = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        fieldPassword.sendKeys("Password1!");
        pausa(3);
        WebElement btnYalla=driver.findElement(By.xpath("//button[text()='Y’alla!']"));
        btnYalla.click();
        pausa(2);
        WebElement btnPositive = driver.findElement(By.xpath("//button[@class='positive-button ng-star-inserted']"));
        btnPositive.click();
        pausa(5);
        WebElement btnLogOut = driver.findElement(By.xpath("//*[@href='/logout?url=%2Fsearch']"));
        pausa(2);
        driver.navigate().refresh();
        pausa(2);
        driver.quit();




}

    public void pausa(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
