package proyecto.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyecto.userInterface.login_POM;

public class login_Task implements Task {

	private String username; //Alamacena el nombre
	private String password; //Almacena la contraseña
	
	private login_Task (String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public static login_Task Using(String username, String password) {
		return new login_Task (username, password);
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(
			
			Enter.theValue(username).into(login_POM.TXT_Username),
			Enter.theValue(password).into(login_POM.TXT_Password),
			Click.on(login_POM.BTN_Login)
		);
		

	}
}
