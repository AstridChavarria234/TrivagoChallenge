package co.com.accenture.certification.trivagochallenge.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Accommodation extends PageObject{

	 public static final Target TYPE_ACCOMMODATION=Target.the("Click in type of accommodation").locatedBy("//*[@class='toolbar-list__item toolbar-list__item--stars js-toolbar__item--stars js-toolbar-stars']");  
	    public static final Target CHOOSE_ACCOMMODATION = Target.the("Select the accommodation").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[2]/div/div/section/div/div/div[1]/div/ul/li[2]/button/span[1]");
}
