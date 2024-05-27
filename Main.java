package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.name("FirstName")).sendKeys("Dina");
        driver.findElement(By.name("LastName")).sendKeys("Mohamed");

        Select day = new Select(driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]")));
        day.selectByIndex(26);

        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByVisibleText("January");

        Select year = new Select(driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]")));
        year.selectByValue("2002");

        driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("Dina@mailinator.com");

        driver.findElement(By.id("Company")).sendKeys("DM");

        driver.findElement(By.id("Password")).sendKeys("12345678DM");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678DM");

        driver.findElement(By.name("register-button")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@class=\"ico-logout\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@class=\"ico-login\"]")).click();
        Thread.sleep(1000);


        driver.findElement(By.id("Email")).sendKeys("Dina@mailinator.com");
        driver.findElement(By.id("Password")).sendKeys("12345678DM");


        driver.findElement(By.xpath("//*[@class=\"button-1 login-button\"]")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@alt=\"Picture for category Electronics\"]")).click();
        Thread.sleep(500);


        driver.findElement(By.xpath("//*[@class=\"listbox\"]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@alt=\"Picture for category Desktops\"]")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@alt=\"Picture of Lenovo IdeaCentre 600 All-in-One PC\"]")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@class=\"qty-input\"]")).clear();
        driver.findElement(By.xpath("//*[@class=\"qty-input\"]")).sendKeys("3");

        driver.findElement(By.xpath("//*[@class=\"button-1 add-to-cart-button\"]")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@title=\"Close\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@class=\"cart-label\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[id=\"termsofservice\"]")).click();
        Thread.sleep(500);

        driver.findElement(By.cssSelector("button[id=\"checkout\"]")).click();
        Thread.sleep(500);

        //driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"]")).click();


        Select country = new Select(driver.findElement(By.cssSelector("select[name=\"BillingNewAddress.CountryId\"]")));
        country.selectByValue("123");
        Thread.sleep(500);

        driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_City\"]")).sendKeys("Cairo");
        driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_Address1\"]")).sendKeys("giza");
        Thread.sleep(500);

        driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("11571");
        driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("01011571987");
        Thread.sleep(500);

        driver.findElement(By.cssSelector("button[onclick=\"if (!window.__cfRLUnblockHandlers) return false; Billing.save()\"]")).click();
        Thread.sleep(500);

        driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]")).click();
        Thread.sleep(3000);


        driver.quit();



    }
}