package service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import model.Army;
import model.Daniel;
import model.Match;
import model.Michal;
import model.enumeration.Fraction;
import model.enumeration.Hero;
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
        List<Fraction> firstPlayerFractions = Fraction.toList();
        List<Fraction> secondPlayerFractions = Fraction.toList();

        Random random = new Random();
        List<Fraction> firstPlayerResult = new LinkedList<>();
        List<Fraction> secondPlayerResult = new LinkedList<>();

        //Generates 10 fractions in two lists respectively. No mirror ones
        for (int i = 0; i < Fraction.values().length; i++) {
            int firstPlayerIndex = random.nextInt(firstPlayerFractions.size());
            Fraction firstPlayerFraction = firstPlayerFractions.get(firstPlayerIndex);
            firstPlayerResult.add(firstPlayerFraction);
            firstPlayerFractions.remove(firstPlayerFraction);
            while (true) {
                int secondPlayerIndex = random.nextInt(secondPlayerFractions.size());
                Fraction secondPlayerFraction = secondPlayerFractions.get(secondPlayerIndex);
                if (secondPlayerFraction != firstPlayerFraction) {
                    secondPlayerResult.add(secondPlayerFraction);
                    secondPlayerFractions.remove(secondPlayerFraction);
                    break;
                }
            }
        }

        //Generates army, hero, color and reset order for each list of fractions and prints the results
        for (int i = 0; i < Fraction.values().length; i++) {
            Fraction michalFraction = firstPlayerResult.get(i);
            Fraction danielFraction = secondPlayerResult.get(i);

            Army michalArmy = new Army(michalFraction, armyService.rollHero(michalFraction));
            Army danielArmy = new Army(danielFraction, armyService.rollHero(danielFraction));

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
    public void reRollChampion(Hero bannedHero) {
        Hero michal = armyService.rollHero(bannedHero);
        System.out.println(michal);
    }

    @Override
    public void reRollChampions(Hero michalBannedHero, Hero danielBannedHero) {
        Hero michal = armyService.rollHero(michalBannedHero);
        Hero daniel = armyService.rollHero(danielBannedHero);
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
