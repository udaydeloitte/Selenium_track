package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\udayprsingh\\Downloads\\chromedriver.exe");
        WebDriver driver;
        ChromeOptions option=new ChromeOptions();
        option.addArguments("headless");
        driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo");
        String title=driver.getTitle();
        System.out.println("PASS");
        driver.get("https://phptravels.org/login");
        String login=driver.getTitle();
        System.out.println(login);
        if (login.equals(title)){
            System.out.println("Pass: Same title");
        }
        else{
            System.out.println("Title Not Same: Fail");
        }
        driver.get("https://phptravels.com/demo");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.get("https://phptravels.com/order");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
        driver.quit();



    }
}
