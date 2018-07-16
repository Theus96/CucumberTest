package br.com.cucumber.brq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver dr;

	@Given("^sample feature file is ready$")
	public void testedois() {
		System.setProperty("webdriver.gecko.driver", "C:/DEV/LIB/geckodriver.exe");
		dr = new FirefoxDriver();
	}

	@When("^I run the feature file$")
	public void testetres() {
		dr.get("https://www.globo.com/");
		System.out.println("Titlllle  >>>>   " + dr.getTitle());
		System.out.println("Given statement executed successfully");
		System.out.println("When statement execueted successfully");
	}

	@Then("^run should be \"([^\"]*)\" successful$")
	public void testequatro(String pesquisa) throws InterruptedException {
		dr.findElement(By.id("home-search-field")).sendKeys(pesquisa);
		Thread.sleep(5000);
		dr.close();
		System.out.println("Then statement executed successfully");
	}

	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/DEV/LIB/geckodriver.exe");
		dr = new FirefoxDriver();
		dr.get("www.globo.com");
		System.out.println("Titlllle  >>>>   " + dr.getTitle());
	}

//    @When("^Enter the Username and Password$")
//    public void enter_the_Username_and_Password() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^Reset the credential$")
//    public void reset_the_credential() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Given("^sample feature file is ready$")
//    public void sample_feature_file_is_ready() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I run the feature file$")
//    public void i_run_the_feature_file() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^run should be successful$")
//    public void run_should_be_successful() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
}