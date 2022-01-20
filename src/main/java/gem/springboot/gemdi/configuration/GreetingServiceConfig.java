package gem.springboot.gemdi.configuration;

import com.springbootpets.PetService;
import com.springbootpets.PetServiceFactory;
import gem.springboot.gemdi.repositories.EnglishGreetingRepository;
import gem.springboot.gemdi.repositories.EnglishGreetingRepositoryImpl;
import gem.springboot.gemdi.repositories.SpanishGreetingRepository;
import gem.springboot.gemdi.repositories.SpanishGreetingRepositoryImpl;
import gem.springboot.gemdi.services.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

//@Service
@ImportResource("classpath:gem-config.xml")
@Configuration
public class GreetingServiceConfig
{

    @Bean
    PetServiceFactory petServiceFactory()
    {
        return new PetServiceFactory();
    }

    @Profile({"dog","default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory)
    {
     return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory)
    {
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    SpanishGreetingRepository spanishGreetingRepository()
    {
        return new SpanishGreetingRepositoryImpl();
    }

    @Profile({"Spanish","default"})
    @Bean("initializeServiceEnglish")
    InitializeSpanishGreetingService initializeServiceSpanish(SpanishGreetingRepository spanishGreetingRepository)
    {
        return new InitializeSpanishGreetingService(spanishGreetingRepository);
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository()
    {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("English")
    @Bean
    InitializeEnglishGreetingService initializeServiceEnglish(EnglishGreetingRepository englishGreetingRepository)
    {
        return new InitializeEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingServices primaryGreetingServices()
    {
        return new PrimaryGreetingServices();
    }
    //@Bean
    ConstructorGreetingService constructorGreetingService()
    {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService()
    {
        return  new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService()
    {
        return  new SetterInjectedGreetingService();
    }
}
