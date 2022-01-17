package gem.springboot.gemdi;

import gem.springboot.gemdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GemDiApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(GemDiApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		PetController petController = applicationContext.getBean("petController" , PetController.class);
		System.out.println("-----The Best Pet is-----");
		System.out.println(petController.whichPetIsTheBest());

		InitializeController initializeController = (InitializeController) applicationContext.getBean("initializeController");
		System.out.println(initializeController.hello());

		System.out.println("-------Primary Bean--------");
		System.out.println(myController.hello());

		System.out.println(" ");

		System.out.println("-------Property--------");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println(" ");

		System.out.println("-------Setter-------");
		SetterInjectedController setterInjectedController = (SetterInjectedController)  applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println(" ");

		System.out.println("-------Constructor-------");
		ConstructorInjectedController constructorInjectedController =(ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
