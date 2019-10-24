package co.com.accenture.certification.trivagochallenge.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public  class HotelService extends PageObject{
	
	public static final Target HOTEL_SERVICE=Target.the("Click in service hotel ").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[5]/button");  
    public static final Target CHOOSE_SERVICE=Target.the("Select in service hotel ").locatedBy("//button[contains(text(),'Servicios del hotel')]");  
    public static final Target CHOOSE_FIRST_SERVICE=Target.the("Select in first service hotel ").located(By.id("250/300-6")); 
    public static final Target CHOOSE_SECOND_SERVICE=Target.the("Select in second service hotel ").located(By.id("47/300-8")); 
    public static final Target CHOOSE_THIRD_SERVICE=Target.the("Select in third service hotel ").located(By.id("57/300-10")); 
    public static final Target  LISTO_BUTTON=Target.the("Click on listo button").locatedBy("//*[@class='btn btn--small refinement-row__btn btn--primary']"); 
}
