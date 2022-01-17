package gem.springboot.gemdi.controller;

import gem.springboot.gemdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    private  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello()
    {
        return greetingService.sayGreeting();
    }
}
