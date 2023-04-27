package TestCase04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase04 extends TestBase {


    @Test
    public void testCase04() {

        //    1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        bekle(2);
        //3. Verify that home page is visible successfully
        WebElement home =driver.findElement(By.xpath("//a/i[@class='fa fa-home']"));
        Assert.assertTrue(home.isDisplayed());


        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a/i[@class='fa fa-lock']")).click();
        bekle(1);
        //5. Verify 'Login to your account' is visible
        WebElement girisyapin =driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(girisyapin.isDisplayed());

        //6. Enter incorrect email address and password
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("eraskoy@gmail.com");
        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("12345678");

        //7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        //8. Verify error 'Your email or password is incorrect!' is visible
       WebElement girishatasi =  driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
       Assert.assertTrue(girishatasi.isDisplayed());
    }
}
