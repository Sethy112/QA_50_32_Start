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


        WebElement divRoot = driver.findElement(By.cssSelector("*[id='root']"));
        System.out.println(divRoot.getAttribute("class"));

        WebElement divRootClass = driver.findElement(By.cssSelector("div[class='container']"));


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

    @Test
    public void iLCarroTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        pause(2);
        driver.navigate().to("https://ilcarro.web.app/let-car-work");
        pause(2);
        driver.navigate().back();
        pause(2);
        driver.navigate().refresh();
        pause(2);
        WebElement termOfUse = driver.findElement(By.cssSelector("a[href='/terms-of-use']"));
        termOfUse.click();
        pause(2);

        WebElement logoHeader = driver.findElement(By.cssSelector("img[alt='logo']"));
        logoHeader.click();
//        .navigation-link
//        a.navigation-link
//        a[class='navigation-link']
//        *[class='navigation-link']
//       [class='navigation-link']
        WebElement btnSearch = driver.findElement(By.className("navigation-link"));
        btnSearch.click();
        pause(2);

//          a[href*='/of-use'] включает
//        a[href^='/term'] начинается
//        a[href$='/-use'] заканчивается


//        WebElement logIn = driver.findElement(By.cssSelector("a[href='/login?url=%2Fterms-of-use']"));
        WebElement logIn = driver.findElement(By.cssSelector("a[ng-reflect-router-link='login']"));
        logIn.click();
        pause(2);
        WebElement registrationChild = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        registrationChild.click();
        pause(2);
//        WebElement btnLetCarWork= driver.findElement(By.linkText("Let the car work"));
//        btnLetCarWork.click();
//        pause(2);
        WebElement btnLogIn = driver.findElement(By.cssSelector("div.header a.navigation-link:last-child"));
        btnLogIn.click();
        pause(3);
        WebElement btnLetCarWork= driver.findElement(By.partialLinkText("work"));
        btnLetCarWork.click();
        pause(2);

        driver.navigate().to("https://ilcarro.web.app/search");

//        WebElement logo = driver.findElement(By.cssSelector("a*[class='logo']"));
//        logo.click();
//        pause(2);
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
