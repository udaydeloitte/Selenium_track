import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\udayprsingh\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.goibibo.com/ ");
        Actions action = new Actions(driver);

        WebElement roundTripButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/ul/li[2]/span[1]"));
        roundTripButton.click();
        WebElement From = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div/p"));
        From.click();
        WebElement FromText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input"));
        FromText.click();
        FromText.sendKeys("New York (NYC)");
        Thread.sleep(2000);
        
        WebElement selectFrom = driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]"));
        action.click(selectFrom).build().perform();


    }
}
