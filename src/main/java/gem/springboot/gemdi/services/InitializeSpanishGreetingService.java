package gem.springboot.gemdi.services;

import gem.springboot.gemdi.repositories.SpanishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class InitializeSpanishGreetingService implements GreetingService
{

    private final SpanishGreetingRepository spanishGreetingRepository;

    public InitializeSpanishGreetingService(SpanishGreetingRepository spanishGreetingRepository) {
        this.spanishGreetingRepository = spanishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hola Mundo -- Spanish ";
    }
}
