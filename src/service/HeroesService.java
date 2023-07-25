package service;

import model.enumeration.Champion;

public interface HeroesService {

    void generateMatch();

    void reRollChampion(Champion bannedChampion);

    void reRollChampions(Champion michalBannedChampion, Champion danielBannedChampion);
}
