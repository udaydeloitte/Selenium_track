import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\udayprsingh\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement javaAlert= driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a"));
        javaAlert.click();
        WebElement prompt= driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        prompt.click();
        String alert= driver.switchTo().alert().getText();
        System.out.println(alert);
        driver. switchTo(). alert(). sendKeys("Test");
        driver.switchTo().alert().accept();
        WebElement result = driver.findElement(By.xpath("//*[@id=\"result\"]"));
        if(result.getText().contains("Test"))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        driver.close();;
    }
}
