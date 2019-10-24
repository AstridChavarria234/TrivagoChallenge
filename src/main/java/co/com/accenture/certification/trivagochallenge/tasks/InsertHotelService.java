package co.com.accenture.certification.trivagochallenge.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.accenture.certification.trivagochallenge.userinterfaces.HotelTrivago;
import co.com.accenture.certification.trivagochallenge.userinterfaces.HotelService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class InsertHotelService implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		
  actor.attemptsTo(Click.on(HotelService.HOTEL_SERVICE),
	
	Click.on(HotelService.CHOOSE_SERVICE),
    Click.on(HotelService.CHOOSE_FIRST_SERVICE),
    Click.on(HotelService.CHOOSE_SECOND_SERVICE),
    Click.on(HotelService.CHOOSE_THIRD_SERVICE),
    Click.on(HotelService.LISTO_BUTTON));
		
	}
	public static InsertHotelService inPage() {
		return instrumented(InsertHotelService.class);


}
}	
	
