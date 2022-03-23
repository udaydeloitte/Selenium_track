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
        WebElement phplogo = driver.findElement(By.xpath("//img[contains(@alt,\"logo\")]"));
        WebElement flight = driver.findElement(By.xpath("//a[text()='flights']"));
        WebElement home = driver.findElement(By.xpath(""));
        WebElement tours = driver.findElement(By.xpath("//a[text()=\"Tours\"]"));
        WebElement company = driver.findElement(By.xpath("//body[@id=\"fadein\"]"));
        


        driver.quit();





        //driver.quit();
        }
}
