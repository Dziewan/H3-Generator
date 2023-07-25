package service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import model.Army;
import model.Daniel;
import model.Match;
import model.Michal;
import model.enumeration.Building;
import model.enumeration.Champion;
import model.enumeration.Color;
import model.enumeration.ResetOrder;

public class HeroesServiceImpl implements HeroesService {
    private final ArmyService armyService;
    private final Random random;

    public HeroesServiceImpl() {
        this.armyService = new ArmyService();
        this.random = new Random();
    }

    @Override
    public void generateMatch() {
        List<Building> firstPlayerBuildings = Building.toList();
        List<Building> secondPlayerBuildings = Building.toList();

        Random random = new Random();
        List<Building> firstPlayerResult = new LinkedList<>();
        List<Building> secondPlayerResult = new LinkedList<>();

        for (int i = 0; i < Building.values().length; i++) {
            int firstPlayerIndex = random.nextInt(firstPlayerBuildings.size());
            Building firstPlayerBuilding = firstPlayerBuildings.get(firstPlayerIndex);
            firstPlayerResult.add(firstPlayerBuilding);
            firstPlayerBuildings.remove(firstPlayerBuilding);
            while (true) {
                int secondPlayerIndex = random.nextInt(secondPlayerBuildings.size());
                Building secondPlayerBuilding = secondPlayerBuildings.get(secondPlayerIndex);
                if (secondPlayerBuilding != firstPlayerBuilding) {
                    secondPlayerResult.add(secondPlayerBuilding);
                    secondPlayerBuildings.remove(secondPlayerBuilding);
                    break;
                }
            }
        }

        for (int i = 0; i < Building.values().length; i++) {
            Building michalBuilding = firstPlayerResult.get(i);
            Building danielBuilding = secondPlayerResult.get(i);

            Army michalArmy = new Army(michalBuilding, armyService.rollHero(michalBuilding));
            Army danielArmy = new Army(danielBuilding, armyService.rollHero(danielBuilding));

            Color michalColor = rollColor();
            Color danielColor = michalColor.getOpposite();

            ResetOrder michalResetOrder = rollResetOrder();
            ResetOrder danielResetOrder = michalResetOrder.getOpposite();

            Michal michal = new Michal(michalArmy, michalColor, michalResetOrder);
            Daniel daniel = new Daniel(danielArmy, danielColor, danielResetOrder);

            Match match = new Match(michal, daniel);
            System.out.println(match);
            System.out.println();
        }
    }

    @Override
    public void reRollChampion(Champion bannedChampion) {
        Champion michal = armyService.rollHero(bannedChampion);
        System.out.println(michal);
    }

    @Override
    public void reRollChampions(Champion michalBannedChampion, Champion danielBannedChampion) {
        Champion michal = armyService.rollHero(michalBannedChampion);
        Champion daniel = armyService.rollHero(danielBannedChampion);
        System.out.println("Michal: " + michal);
        System.out.println("Daniel: " + daniel);
    }

    private Color rollColor() {
        return roll() ? Color.RED : Color.BLUE;
    }

    private ResetOrder rollResetOrder() {
        return roll() ? ResetOrder.FIRST : ResetOrder.SECOND;
    }

    private boolean roll() {
        return random.nextInt(100) < 50;
    }
}
