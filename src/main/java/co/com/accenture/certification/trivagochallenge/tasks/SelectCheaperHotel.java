package co.com.accenture.certification.trivagochallenge.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.io.IOException;

import co.com.accenture.certification.trivagochallenge.model.DataHotel;
import co.com.accenture.certification.trivagochallenge.userinterfaces.PriceHotel;
import co.com.accenture.certification.trivagochallenge.util.Managetxt;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;




public class SelectCheaperHotel implements Task {
	
	private DataHotel data = new DataHotel(); 
	//private	Managetxt manage; 
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(PriceHotel.ORDER_BY),
		   Click.on(PriceHotel.ORDER_BY_PRICE));
		
	data.setName(Text.of(PriceHotel.NAME_CHEAPER_HOTEL).viewedBy(actor).asString());
	data.setPrice(Text.of(PriceHotel.PRICE_HOTEL).viewedBy(actor).asString());
	
	   System.out.println("Hotel Name : "  + data.getName());
		System.out.println(	"Price  : "  + data.getPrice());		
	
	
		/*try {
			manage.writeInTxt();
		} catch (IOException e) {
		
			e.printStackTrace();
		}  
		
*/

	
	
	}
	
	
	public static SelectCheaperHotel print() {
		return instrumented(SelectCheaperHotel.class);

		
	}

}
