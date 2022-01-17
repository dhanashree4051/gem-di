package gem.springboot.gemdi;

import gem.springboot.gemdi.controller.ConstructorInjectedController;
import gem.springboot.gemdi.controller.MyController;
import gem.springboot.gemdi.controller.PropertyInjectedController;
import gem.springboot.gemdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GemDiApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(GemDiApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");
		String strGreet = myController.hello();
		System.out.println(strGreet);

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
