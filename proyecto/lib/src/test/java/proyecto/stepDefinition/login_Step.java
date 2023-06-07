package proyecto.stepDefinition;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import proyecto.tasks.add_Tasks;
import proyecto.tasks.login_Task;
import proyecto.userInterface.add_POM;
import proyecto.userInterface.login_POM;

public class login_Step extends base{
	private login_POM login; 
	private add_POM add;
	
	@Before 
	public void setUp() {
		Yesica.can(BrowseTheWeb.with(driver));
	}

	
	
	@Given("^Un usuario que se encuentran en el apartado recruitment$")
    public void un_usuario_que_se_encuentran_en_el_apartado_recruitment() throws Throwable {

		Yesica.wasAbleTo(Open.browserOn(login));
		Yesica.attemptsTo(login_Task.Using("Admin", "admin123"));
		
    }

    @When("^El usuario ingresa credenciales validas$")
    public void el_usuario_ingresa_credenciales_validas() throws Throwable {
    
    	Yesica.attemptsTo(add_Tasks.Using("Yesica", "Giraldo", "yes.giraldo@fsdfgh.com"));
    
    	//Yesica.attemptsTo(add_Tasks.Using(""));
    
    
    }

    @Then("^La pagina muestra el usuario agregado en la lista de candidatos$")
    public void la_pagina_muestra_el_usuario_agregado_en_la_lista_de_candidatos() throws Throwable {
    	Yesica.attemptsTo(WaitUntil.the(add_POM.LBL_UsersCounter, isVisible()).forNoMoreThan(10).seconds());
    	Yesica.attemptsTo(Ensure.that(add_POM.LBL_UsersCounter).text().isNotEqualTo(add_Tasks.texto));
    	
    
    
    
    }

}
