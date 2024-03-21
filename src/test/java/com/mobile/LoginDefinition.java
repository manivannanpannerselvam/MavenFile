package com.mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDefinition {

    WebDriver driver;

    @Given("User is on Home page")
    public void userOnHomePage() {

        System.out.println("Thread ID - " + Thread.currentThread().getId());
//        System.setProperty("webdriver.chrome.driver","/Users/manivannanpanneerselvam/Downloads/chromedriver_4");
//        driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("User enters username as {string}")
    public void entersUsername(String userName) throws InterruptedException {

        System.out.println("Username Entered");
//        driver.findElement(By.name("username")).sendKeys(userName);

    }

    @When("User enters password as {string}")
    public void entersPassword(String passWord) throws InterruptedException {

        System.out.println("Password Entered");
      //  driver.findElement(By.name("txtPassword")).sendKeys(passWord);

      //  driver.findElement(By.id("btnLogin")).submit();
    }

    @Then("User should be able to login sucessfully")
    public void sucessfullLogin() throws InterruptedException {

//        String newPageText = driver.findElement(By.id("welcome")).getText();
//        System.out.println("newPageText :" + newPageText);
        //  assertThat(newPageText, containsString("Welcome"));

    //    driver.quit();
    }
}
