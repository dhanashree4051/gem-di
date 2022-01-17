package gem.springboot.gemdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"Spanish","default"})
@Service("initializeService")
public class InitializeSpanishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting() {
        return "Hola Mundo -- Spanish ";
    }
}
