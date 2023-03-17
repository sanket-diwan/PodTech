package com.thinkitive.trst.glue;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Loginglue {

    WebDriver driver= new FirefoxDriver();

    @Given("user opens browser and navigates to {string} url")
    public void userOpensBrowserAndNavigatesToUrl(String url) {
        driver.get(url);
    }

    @When("user entered {string} in username field and {string} in password field")
    public void userEnteredInUsernameFieldAndInPasswordField(String username, String password) {
        driver.findElement(By.xpath("//input[@name='user']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    @And("Clicked on login button")
    public void clickedOnLoginButton() {
        driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium _button_m53zm_13 css-151j50p']")).click();
    }

    @Then("User should be logged in and dashboard page should be displayed")
    public void userShouldBeLoggedInAndDashboardPageShouldBeDisplayed() throws Throwable {
        String ActualUrl=driver.getCurrentUrl();
        String ExpectedUrl="https://qa.trsthealth.com/login";
        Assert.assertEquals(ActualUrl,ExpectedUrl);
        Thread.sleep(3000);
        driver.quit();
    }


}
