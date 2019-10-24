package co.com.accenture.certification.trivagochallenge.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class HotelTrivago extends PageObject {
	public static final Target DESTINATION_CITY = Target.the("Click in field destination city").located(By.id("querytext"));
	public static final Target CHOOSE_DESTINATION_CITY=Target.the("Select the destination city").located(By.id("suggestion-65524/200"));
    public static final Target DATE_ARRIVE = Target.the("Select the arrivedate").locatedBy("//*[@datetime='{0}']");
    public static final Target DATE_DEPARTURE = Target.the("Select the departuredate").locatedBy("//*[@datetime='{0}']");
    public static final Target SEARCH_BUTTON=Target.the("Click on the search button").locatedBy("//*[@class='search-button__label']");
   
    	
 
                                                           
    
    

}
