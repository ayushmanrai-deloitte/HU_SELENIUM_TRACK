import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class scenario2 {
    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");//Chromedriver
        WebDriver dri  = new ChromeDriver();
        dri.get ("https://jqueryui.com/droppable/");//Url opening
        dri.switchTo().frame(0);//Selecting frame
        Thread.sleep (3000);
        WebElement A =dri.findElement(By.id("draggable"));
        WebElement B =dri.findElement(By.id("droppable"));
        Actions action = new Actions(dri);
        action.dragAndDrop(A ,B).build().perform();//dragging A on B

    }

}