package co.com.accenture.certification.trivagochallenge.stepdefinitions;

import org.openqa.selenium.WebDriver;


import co.com.accenture.certification.trivagochallenge.questions.HotelState;
import co.com.accenture.certification.trivagochallenge.tasks.SelectCheaperHotel;
import co.com.accenture.certification.trivagochallenge.tasks.InsertAccommodation;
import co.com.accenture.certification.trivagochallenge.tasks.InsertHotelData;
import co.com.accenture.certification.trivagochallenge.tasks.InsertHotelService;
import co.com.accenture.certification.trivagochallenge.tasks.OpenTrivago;
import co.com.accenture.certification.trivagochallenge.userinterfaces.HomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.io.IOException;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class SelectHotelStepDefinition {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private HomePage page;
	
	@Before
	public void setUp() {
		 OnStage.setTheStage(new OnlineCast());
	        OnStage.theActorCalled("Astrid").can(
	        BrowseTheWeb.with(herBrowser));

	
	}
	
	@Given("^that Astrid wants to look for a hotel reservation$")
	public void thatAstridWantsToLookForAHotelReservation() throws Exception {
		theActorInTheSpotlight().wasAbleTo(OpenTrivago.on(page));
	  
	}


	@When("^She insert the destination city \"([^\"]*)\" ,the arrival date \"([^\"]*)\" and departure date \"([^\"]*)\"$")
	public void sheInsertTheDestinationCityTheArrivalDateAndDepartureDate(String city, String arrivalDate, String departureDate) throws Exception {
	   
		theActorInTheSpotlight().attemptsTo(InsertHotelData.inPage(city,arrivalDate,departureDate));
		   
	}

	@When("^she select type of accommodation$")
	public void sheSelectTypeOfAccommodation() throws Exception {
		theActorInTheSpotlight().attemptsTo(InsertAccommodation.inPage());
	  
	}

	@When("^she select three hotel service options$")
	public void sheSelectThreeHotelServiceOptions() throws Exception {
		theActorInTheSpotlight().attemptsTo(InsertHotelService.inPage());
	
	}
@When("^she print the data cheaper hotel$")
public void shePrintTheDataCheaperHotel() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(SelectCheaperHotel.print());
	
}

	@Then("^I verify the see the state of the hotel$")
	public void iVerifyTheSeeTheStateOfTheHotel() throws Exception {
		theActorInTheSpotlight().should(seeThat(HotelState.Score()));
	
	}
}
