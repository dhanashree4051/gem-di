package gem.springboot.gemdi.repositories;

public class SpanishGreetingRepositoryImpl implements SpanishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello world -- Spanish";
    }
}
