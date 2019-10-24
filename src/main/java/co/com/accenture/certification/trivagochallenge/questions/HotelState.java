package co.com.accenture.certification.trivagochallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import co.com.accenture.certification.trivagochallenge.userinterfaces.StateHotel;
import net.serenitybdd.core.pages.WebElementFacade;

public class HotelState implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		

	    	 WebElementFacade scoreHotel = StateHotel.TITLE_STATE.resolveFor(actor);
	        String state = scoreHotel.getText();
	        return state.contains("Excelente ") || state.contains("Muy bueno ") || state.contains("Bueno ");

	
	
	    	/*if(Text.of(StateHotel.TITLE_STATE).viewedBy(actor).asString().contains("Excelente "))/* ||
			state_hotel.contains("Muy bueno ") ||state_hotel.contains("Bueno "))
		return "Excelente";
				
		else
			if(Text.of(StateHotel.TITLE_STATE).viewedBy(actor).asString().contains("Muy bueno "))
				return "Muy bueno" ;
	
			else
				
				if(Text.of(StateHotel.TITLE_STATE).viewedBy(actor).asString().contains("Bueno"))
					return "Bueno";
				else
					return "Estado no disponible";
	
	*/
		
	
	}
	
	
	public static HotelState Score() {
		return new HotelState();
		}

}
