package co.com.accenture.certification.trivagochallenge.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.accenture.certification.trivagochallenge.userinterfaces.HotelTrivago;
import co.com.accenture.certification.trivagochallenge.userinterfaces.Accommodation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class InsertAccommodation implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo( Click.on(Accommodation.TYPE_ACCOMMODATION),
		    Click.on(Accommodation.CHOOSE_ACCOMMODATION));
		
	}
	
	
	public static InsertAccommodation inPage() {
		return instrumented(InsertAccommodation.class);

		
	}

}
