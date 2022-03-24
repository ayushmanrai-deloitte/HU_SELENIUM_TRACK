import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class goibibo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver dri = new ChromeDriver();
        dri.manage().window().maximize();// browser window maximizes
        dri.get("https://www.goibibo.com/");//goes to url
        Thread.sleep(2000);
        dri.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/ul/li[2]/span[2]")).click();//click on js prompt
        WebElement from = dri.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input"));

        from.sendKeys("New York");
        Thread.sleep(2000);
    }
}
