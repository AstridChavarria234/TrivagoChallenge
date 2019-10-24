package co.com.accenture.certification.trivagochallenge.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTrivago  implements Task{
private PageObject page;

public OpenTrivago(PageObject page) {
		
		this.page = page;
	}

@Override
public <T extends Actor> void performAs(T actor) {
	actor.wasAbleTo(Open.browserOn(page));
	
}


public static OpenTrivago on(PageObject page) {
	
	return instrumented(OpenTrivago.class, page);
	
}


}
