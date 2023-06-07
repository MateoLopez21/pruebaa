package proyecto.stepDefinition;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class base {

	
	/*
	 * Cumple la función de inicializar el Driver, y el Actor
	 */
	
	
	//Creamos e instanciamos el actor //
	public static Actor Yesica = Actor.named("Yesica");
	
	
	@Managed(uniqueSession = true)
	public static WebDriver driver;
}
