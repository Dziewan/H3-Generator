import model.*;
import model.enumeration.Hero;
import service.HeroesService;
import service.HeroesServiceImpl;

import java.util.List;

import static model.enumeration.Hero.*;

public class Main {
    private static final HeroesService HEROES_SERVICE = new HeroesServiceImpl();
    private static final String STATS = "Daniel - 2 : 1 - Michal";

    public static void main(String[] args) {
        getHeroDetails(LACUS);
    }

    private static void generateMatches() {
        List<Match> matches = HEROES_SERVICE.generateMatches();
        matches.forEach(System.out::println);
    }

    private static void reRollChampion(Hero bannedChampion) {
        Hero hero = HEROES_SERVICE.reRollChampion(bannedChampion);
        System.out.println(hero);
    }

    private static void reRollChampions(Hero michalBannedChampion, Hero danielBannedChampion) {
        HeroPair heroPair = HEROES_SERVICE.reRollChampions(michalBannedChampion, danielBannedChampion);
        System.out.println(heroPair);
    }

    private static void getHeroDetails(Hero hero) {
        System.out.println(hero);
    }
}