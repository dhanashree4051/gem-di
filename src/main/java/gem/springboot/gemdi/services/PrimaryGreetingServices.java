package gem.springboot.gemdi.services;


public class PrimaryGreetingServices implements GreetingService
{

    @Override
    public String sayGreeting()
    {
        return "Hello World from the PRIMARY Bean";
    }
}
