import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertassign {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver dri = new ChromeDriver();
        dri.manage().window().maximize();// browser window maximizes
        dri.get("https://the-internet.herokuapp.com/");//goes to url
        Thread.sleep (2000);
        dri.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");//Click on java script
        Thread.sleep (2000);
        dri.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();//click on js prompt
        Thread.sleep (3000);
        System.out.println(dri.switchTo().alert().getText());
        String expected = "You entered: Ex-Test";//alert input
        dri.switchTo().alert().sendKeys("Ex-Test");
        Thread.sleep (3000);
        dri.switchTo().alert().accept();
        String input = dri.findElement(By.xpath("//*[@id='result']")).getText();
        if (input.contains("Ex-Text"))
        {
            System.out.println("VERIFIED");
        }else
        {
            System.out.println("NOT VERIFIED");
        }


    }
}