package starter.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Reqres.ReqresAPI;

import java.io.File;

public class ReqresStepDef {

    @Steps
    ReqresAPI reqresAPI;
    @Given("Get list user with valid paramter page {int}")
    public void getListUserWithValidParamterPage(int page) {
        reqresAPI.getListUserValidParamPage(page);

    }

    @When("Send get list users")
    public void sendGetListUsers() {
        SerenityRest.when().get(ReqresAPI.GET_LIST_USERS);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @Given("Post create user with valid json")
    public void postCreateUserWithValidJson() {
        File json = new File (ReqresAPI.REQ_BODY_DIR+"UserReqBody.json");
        reqresAPI.postCreateUser(json);
    }

    @When("Send post create user")
    public void sendPostCreateUser() {
        SerenityRest.when().post(ReqresAPI.POST_CREATE_USER);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }
}
