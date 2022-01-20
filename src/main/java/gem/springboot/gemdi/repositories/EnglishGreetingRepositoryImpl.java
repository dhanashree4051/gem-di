package gem.springboot.gemdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository
{


    @Override
    public String getGreeting()
    {
        return "Hello world -- English";
    }
}
