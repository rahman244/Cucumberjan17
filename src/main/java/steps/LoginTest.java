package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver = null;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page()  {

        System.setProperty("webdriver.chorme.driver","/Users/papia/Desktop/cucumber2020/Cucumberjan17/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }


    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() {
        WebElement SarchBoxe = driver.findElement(By.id("twotabsearchtextbox"));

        SarchBoxe.sendKeys("Girl pant");



    }

    @Then("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() {


        WebElement Clickbau = driver.findElement(By.xpath("//input[@class='nav-input'and@type='submit']"));
        Clickbau.click();

    }



}
