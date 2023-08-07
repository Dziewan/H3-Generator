package factory;

import model.*;
import model.enumeration.*;
import service.*;

import java.util.*;

public class HeroesServiceFactory {

    private HeroesServiceFactory() {
    }

    public static HeroesService newInstance() {
        return HeroesServiceImpl.getInstance();
    }

    private static class HeroesServiceImpl implements HeroesService {
        private final ArmyService armyService;
        private final Random random;

        private HeroesServiceImpl() {
            this.armyService = new ArmyService();
            this.random = new Random();
        }

        public static HeroesService getInstance() {
            return new HeroesServiceImpl();
        }

        @Override
        public List<Match> generateMatches() {
            List<Match> matches = new ArrayList<>();
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

                matches.add(new Match(michal, daniel));
            }

            return matches;
        }

        @Override
        public Hero reRollChampion(Hero bannedHero) {
            return armyService.rollHero(bannedHero);
        }

        @Override
        public HeroPair reRollChampions(Hero michalBannedHero, Hero danielBannedHero) {
            Hero michal = armyService.rollHero(michalBannedHero);
            Hero daniel = armyService.rollHero(danielBannedHero);

            return new HeroPair(michal, daniel);
        }

        @Override
        public HeroDetails getHeroDetails(Hero hero) {
            return new HeroDetails(hero, hero.getSpec(), hero.getPrimarySkillset(), hero.getSecondarySkillSet());
        }

        @Override
        public List<Hero> getHeroes() {
            return Arrays.stream(Hero.values())
                .sorted(Comparator.comparing(Hero::name))
                .toList();
        }

        @Override
        public List<Skill> getSkills() {
            return Arrays.stream(Skill.values())
                .sorted(Comparator.comparing(Skill::name))
                .toList();
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
}
