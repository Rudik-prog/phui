package com.phonebook.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test
    public void newUserRegistrationPositiveTest() {
        driver.findElement(By.cssSelector("[href='/login']")).click();
        //    enter email to email field
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("qwe@bab.com");
        //    enter password
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Aa123456$");
        //    click on Registration button
        driver.findElement(By.name("registration")).click();
        //    verify SignOut button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));



    }
//    click on login Linrk
//    enter email to email field
//    enter password
//    enter Password to pasword field
//    click on Registration button
//    verify SignOut button is displayed


}
