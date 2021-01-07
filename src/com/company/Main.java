package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
        System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
    }
}
