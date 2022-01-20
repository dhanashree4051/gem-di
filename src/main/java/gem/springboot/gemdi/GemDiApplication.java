package gem.springboot.gemdi;

import gem.springboot.gemdi.controller.*;
import gem.springboot.gemdi.datasource.FakeDataSource;
import gem.springboot.gemdi.services.PrototypeBean;
import gem.springboot.gemdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = {"gem.springboot.gemdi","com.springbootpets"})
@SpringBootApplication
public class GemDiApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(GemDiApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		System.out.println(" ");

		PetController petController = applicationContext.getBean("petController" , PetController.class);
		System.out.println("-----The Best Pet is-----");
		System.out.println(petController.whichPetIsTheBest());

		InitializeController initializeController = (InitializeController) applicationContext.getBean("initializeController");
		System.out.println(initializeController.hello());

		System.out.println(" ");

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

		System.out.println(" ");

		System.out.println("-------BEAN SCOPES--------");

		SingletonBean singletonBean = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean.getMyScope());
		SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		System.out.println(" ");

		PrototypeBean prototypeBean = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean.getMyScope());

		PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("-------END BEAN SCOPES--------");

		System.out.println(" ");

		System.out.println("------FakeDataSource-----");
		FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());
		System.out.println("-------End--------");

		System.out.println(" ");

	}

}
