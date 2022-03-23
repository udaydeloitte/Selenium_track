import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Demosele {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\udayprsingh\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/hotels");
        driver.findElement(By.xpath("//img[contains(@alt,\"logo\")]"));
        WebElement logo=driver.findElement(By.xpath("//img[contains(@alt,\"logo\")]"));
        logo.click();
        driver.close();
        WebElement home=driver.findElement(By.xpath("//i[contains(@class,\"la la-bars\")]"));
        home.click();
        //first
        driver.quit();

    }
}
