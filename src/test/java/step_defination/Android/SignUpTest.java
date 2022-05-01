package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class SignUpTest extends Page {

    @Given("user click on getstarted")
    public void getStarted(){
        getSignUpPage().getStarted().click();
    }

    @Then("click on sign up here")
    public void clickSignUp(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSignUpPage().clickSignup().click();
    }

    @Then("user enter {string}, {string}, {string}, {string}, {string}")
    public void userEnter(String firstname, String lastname, String age, String emailadd, String pass) {
        getSignUpPage().getFirstName().click();
        getSignUpPage().getFirstName().sendKeys(firstname);
        getSignUpPage().getLastName().click();
        getSignUpPage().getLastName().sendKeys(lastname);
        getSignUpPage().getAge().click();
        getSignUpPage().getAge().sendKeys(age);
        getSignUpPage().getEmailAdd().sendKeys(emailadd);
        getSignUpPage().getpass().sendKeys(pass);
    }

    @Then("click sign up")
    public void clickSignUpBtn() throws InterruptedException {
        getSignUpPage().getCaptcha().click();
        Thread.sleep(2000);
        getSignUpPage().getclickSignUpBtn().click();
    }
}
