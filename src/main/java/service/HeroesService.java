package service;

import model.*;
import model.enumeration.*;

import java.util.List;

/**
 * Main service responsible for generator functionalities
 */
public interface HeroesService {

    /**
     * Generates a board consisting of:
     * - 10 random matches
     * - No mirror matches
     * - Random heroes for each fraction
     * - Players discerned by colors and reset order
     */
    List<Match> generateMatches();

    /**
     * Rolls random champion from given fraction not including banned hero
     * @param bannedHero Banned hero which is meant not to be included in the new roll
     */
    Hero reRollChampion(Hero bannedHero);

    /**
     * Rolls random champions from given fractions not including banned heroes
     * @param michalBannedHero Michal's hero which is meant not to be included in the new roll
     * @param danielBannedHero Daniel's hero which is meant not to be included in the new roll
     */
    HeroPair reRollChampions(Hero michalBannedHero, Hero danielBannedHero);

    /**
     * Returns Hero's details like specialization, primary and secondary skill with levels
     * @param hero Hero which system gets details for
     */
    HeroDetails getHeroDetails(Hero hero);

    /**
     * Returns list of available heroes
     */
    List<Hero> getHeroes();

    /**
     * Returns list of available hero's skills
     */
    List<Skill> getSkills();
}
