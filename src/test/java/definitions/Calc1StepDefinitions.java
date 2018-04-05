package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import calculator.Calc;

@RunWith(Cucumber.class)
public class Calc1StepDefinitions {
int arg1,arg2;
Calc calc=new Calc();
    @Given("^I have a calculator$")
    public void i_have_a_calculator()  {
        System.out.println("???????????Given???????????");
    }

    @When("^I add (.+) and (.+)$")
    public void i_add_and(int num1, int num2)  {
		arg1=num1;
		arg2=num2;
        System.out.println("num1 : "+num1+"num2 : "+num2);
    }

    @Then("^the result should be (.+)$")
    public void the_result_should_be(int expected)  {
		int actual=calc.sum(arg1,arg2);
		System.out.println("total : " +expected);
		assertEquals(expected,actual);
    }

}