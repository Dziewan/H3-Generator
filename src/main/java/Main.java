import factory.HeroesServiceFactory;
import model.*;
import model.enumeration.Hero;
import service.HeroesService;

import java.util.List;

import static model.enumeration.Hero.*;

public class Main {
    private static final HeroesService HEROES_SERVICE = HeroesServiceFactory.newInstance();
    private static final String STATS = "Daniel - 3:1 - Michal";

    public static void main(String[] args) {
        reRollChampions(TYRAXOR, ZYDAR);
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
        System.out.println(heroPair.michalHero());
        System.out.println(heroPair.danielHero());
    }

    private static void getHeroDetails(Hero hero) {
        System.out.println(hero);
    }
}