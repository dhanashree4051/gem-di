package gem.springboot.gemdi.services;

import gem.springboot.gemdi.repositories.EnglishGreetingRepository;

public class InitializeEnglishGreetingService implements GreetingService
{
private final EnglishGreetingRepository englishGreetingRepository;

    public InitializeEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World -- English";
    }
}
