import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Framesassign
{
    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");//Chromedriver
        WebDriver dri = new ChromeDriver();
        dri.get("https://the-internet.herokuapp.com/");//Url opening
        dri.manage().window().maximize();
        Thread.sleep (3000);
        dri.navigate().to("https://the-internet.herokuapp.com/frames");//Selecting frames
        Thread.sleep (3000);
        dri.findElement(By.xpath("//*[@href='/nested_frames']")).click();//clicking on nested frames
        dri.switchTo().frame("frame-top");
        System.out.println(dri.switchTo().frame("frame-left").getTitle());
        Thread.sleep (3000);
        dri.close();
    }
}
