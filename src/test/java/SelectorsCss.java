import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsCss {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts()
                .pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://telranedu.web.app/home");
        driver.navigate().to("https://telranedu.web.app/home");
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();

//        WebElement divRoot = driver.findElement(By.cssSelector("div[id='root']"));
//        WebElement divRoot = driver.findElement(By.cssSelector("#root"));
//        WebElement divRoot = driver.findElement(By.id("root"));
        WebElement divRoot = driver.findElement(By.cssSelector("*[id='root']"));
        System.out.println(divRoot.getAttribute("class"));

        WebElement divRootClass = driver.findElement(By.cssSelector("div[class='container']"));
//      WebElement divRootClass = driver.findElement(By.cssSelector("*[class='container']"));
//        WebElement divRootClass = driver.findElement(By.cssSelector(".container"));
//        WebElement divRootClass =driver.findElement(By.className("container"));

                System.out.println(divRootClass.getAttribute("id"));


        pause(3);
        driver.navigate().refresh();
        pause(3);
        driver.navigate().to("https://telranedu.web.app/login");
        pause(3);
        driver.navigate().back();
//                driver.close();
        driver.quit();


    }



    static void pause(int time) {

        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
