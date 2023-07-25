package service;

import model.enumeration.Hero;

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
    void generateMatch();

    /**
     * Rolls random champion from given fraction not including banned hero
     * @param bannedHero Banned hero which is meant not to be included in the new roll
     */
    void reRollChampion(Hero bannedHero);

    /**
     * Rolls random champions from given fractions not including banned heroes
     * @param michalBannedHero Michal's hero which is meant not to be included in the new roll
     * @param danielBannedHero Daniel's hero which is meant not to be included in the new roll
     */
    void reRollChampions(Hero michalBannedHero, Hero danielBannedHero);
}
