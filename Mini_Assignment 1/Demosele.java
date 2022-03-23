import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Demosele {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\udayprsingh\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/hotels");
        driver.findElement(By.xpath("//img[contains(@alt,\"logo\")]"));
        WebElement phplogo = driver.findElement(By.xpath("//img[contains(@alt,\"logo\")]"));
        phplogo.click();
        driver.quit();

        driver.findElement(By.xpath("//a[text()='flights']"));

        WebElement flight = driver.findElement(By.xpath("//a[text()='flights']"));
        flight.click();
        driver.quit();


        WebElement home = driver.findElement(By.xpath(""));
        home.click();
        driver.quit();





        //driver.quit();
        }
}
