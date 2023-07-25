import service.HeroesService;
import service.HeroesServiceImpl;

public class Main {
    private static final HeroesService HEROES_SERVICE = new HeroesServiceImpl();

    public static void main(String[] args) {
        HEROES_SERVICE.generateMatch();
    }
}