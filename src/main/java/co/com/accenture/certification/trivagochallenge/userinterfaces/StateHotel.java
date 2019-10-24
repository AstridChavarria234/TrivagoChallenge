package co.com.accenture.certification.trivagochallenge.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StateHotel extends PageObject {
	public static final Target TITLE_STATE=Target.the("See the state hotel").locatedBy("(//*[@class='item__rating-number'])[1]");
}
