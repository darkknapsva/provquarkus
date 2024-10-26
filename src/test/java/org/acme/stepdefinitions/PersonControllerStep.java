package org.acme.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@QuarkusTest
public class PersonControllerStep {



    Response response;



    @Given("the application is running")
    public void the_application_is_running(){

    }


    @When("I send request to {string}")
    public void i_send_request_to(String path){
        given()
                .when()
                .get(path);
        System.out.println("UIASHDIUAHDSIUHASD");
    }


    @Then("the response should be a list")
    public void the_response_should_be_a_list(){
        response.then().body("$", is(not(empty())));
    }











}
