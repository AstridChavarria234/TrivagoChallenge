package co.com.accenture.certification.trivagochallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import  static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.interactions.MoveMouseAction;

import co.com.accenture.certification.trivagochallenge.userinterfaces.HotelTrivago;

public class InsertHotelData  implements Task{
	String city;
	String arriveDate;
	String departureDate;
	
	public InsertHotelData(String city,String arriveDate,String departureDate) {

		this.city=city;
		this.arriveDate = arriveDate;
		this.departureDate = departureDate;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HotelTrivago.DESTINATION_CITY),
		Enter.theValue(city).into(HotelTrivago.DESTINATION_CITY),
		Click.on(HotelTrivago.CHOOSE_DESTINATION_CITY),
		Click.on(HotelTrivago.DATE_ARRIVE.of(arriveDate)),
		Click.on(HotelTrivago.DATE_DEPARTURE.of(departureDate)),
		Click.on(HotelTrivago.SEARCH_BUTTON));
	
   
	
	}

	public static InsertHotelData inPage(String city, String arriveDate, String departureDate) {

		return instrumented(InsertHotelData.class, city,arriveDate,departureDate);
		
	}
}
