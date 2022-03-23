
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.sql.Driver;
public class Googlechrome {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver dri = new ChromeDriver();


        dri.manage().window().maximize();// browser window maximizes

        dri.get("https://phptravels.com/demo");//goes to url
        dri.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actual_1=dri.getTitle();
        String actualTitle = dri.getTitle();
        String expectedTitle = "PHPTRAVELS";
        if(actualTitle.contains(expectedTitle))
            System.out.println("PASS");//it passes
        else
            System.out.println("FAIL ");//fails
        dri.navigate().to("https://phptravels.com/demo");
        String parentWindow = dri.getWindowHandle();
        WebElement login = dri.findElement(By.xpath("/html/body/header/div/nav/a[4]"));//goes to login button

        login.click();
        for(String winHandle : dri.getWindowHandles()){
            dri.switchTo().window(winHandle);
        }
        String actualTitleNext = dri.getTitle();

        String expectedTitleNext= "Login";
        if(actualTitleNext.contains(expectedTitleNext))

            System.out.println("PASS");//pass
        else
            System.out.println("FAIL");//It Fails

        dri.switchTo().window(parentWindow);//goes back to main page
        System.out.println(dri.getCurrentUrl());
        Thread.sleep (3000);
        WebElement pricing = dri.findElement(By.xpath("/html/body/header/div/nav/a[2]"));//goes to pricing
        pricing.click();
        Thread.sleep (4000);
        dri.navigate().back();//goes back to old page
        Thread.sleep (2000);
        dri.navigate().refresh();//refresh the page
        Thread.sleep (2000);
        dri.quit();//page quits
    }

}

