package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Skillrary.PomPages.AddCart;
import com.Skillrary.PomPages.SkillraryDemoLogin;
import com.Skillrary.PomPages.SkillraryLogin;
import com.Skillrary.genericlib.WebDriverUtilies;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import net.bytebuddy.implementation.bind.annotation.This;

public class Stepdefinitions {
	public WebDriverUtilies utilies=new WebDriverUtilies();
	public WebDriver driver;
	@Given("when user open the browser")
	public void when_user_open_the_browser() {
	    ChromeDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    
	}

	@Given("enters the url of the application")
	public void enters_the_url_of_the_application() {
	   driver.get("https://demoapp.skillrary.com/");
	}

	@When("click on login button")
	public void click_on_login_button() {
	driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
	}

	@When("enter the valid username")
	public void enter_the_valid_username() {
	 driver.findElement(By.id("email")).sendKeys("user");
	}

	@When("enter the valid password")
	public void enter_the_valid_password() {
	driver.findElement(By.id("password")).sendKeys("user");
	}

	@When("clcik on login button")
	public void clcik_on_login_button() {
	   driver.findElement(By.name("login")).click();
	}

	@Then("user should succesfully login into the application")
	public void user_should_succesfully_login_into_the_application() {
	   System.out.println("user is login successfully");
	}


}
