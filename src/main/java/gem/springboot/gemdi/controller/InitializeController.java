package gem.springboot.gemdi.controller;

import gem.springboot.gemdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InitializeController
{
    private final GreetingService greetingService;

    public InitializeController(@Qualifier("initializeService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String hello()
    {
       return greetingService.sayGreeting();
    }
}
