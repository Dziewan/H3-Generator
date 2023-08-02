package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import static model.enumeration.Fraction.BASTION;
import static model.enumeration.Fraction.CASTLE;
import static model.enumeration.Fraction.CONFLUX;
import static model.enumeration.Fraction.COVE;
import static model.enumeration.Fraction.DUNGEON;
import static model.enumeration.Fraction.FORTRESS;
import static model.enumeration.Fraction.INFERNO;
import static model.enumeration.Fraction.NECROPOLIS;
import static model.enumeration.Fraction.STRONGHOLD;
import static model.enumeration.Fraction.TOWER;
import static model.enumeration.Hero.AERIS;
import static model.enumeration.Hero.AJIT;
import static model.enumeration.Hero.ALAMAR;
import static model.enumeration.Hero.ALKIN;
import static model.enumeration.Hero.ANABEL;
import static model.enumeration.Hero.ARLACH;
import static model.enumeration.Hero.AYDEN;
import static model.enumeration.Hero.BRISSA;
import static model.enumeration.Hero.BROGHILD;
import static model.enumeration.Hero.BRON;
import static model.enumeration.Hero.CALH;
import static model.enumeration.Hero.CASSIO;
import static model.enumeration.Hero.CHARNA;
import static model.enumeration.Hero.CLANCY;
import static model.enumeration.Hero.CLAVIUS;
import static model.enumeration.Hero.CORKES;
import static model.enumeration.Hero.CRAG_HACK;
import static model.enumeration.Hero.DACE;
import static model.enumeration.Hero.DEEMER;
import static model.enumeration.Hero.DESSA;
import static model.enumeration.Hero.DRAKON;
import static model.enumeration.Hero.ERDAMON;
import static model.enumeration.Hero.EDRIC;
import static model.enumeration.Hero.ELLESHAR;
import static model.enumeration.Hero.ELMORE;
import static model.enumeration.Hero.EOVACIUS;
import static model.enumeration.Hero.FAFNER;
import static model.enumeration.Hero.FIONA;
import static model.enumeration.Hero.FIUR;
import static model.enumeration.Hero.GISELLE;
import static model.enumeration.Hero.GRETCHIN;
import static model.enumeration.Hero.GERWULF;
import static model.enumeration.Hero.GUNDULLA;
import static model.enumeration.Hero.GUNNAR;
import static model.enumeration.Hero.GURNISSON;
import static model.enumeration.Hero.IGNATIUS;
import static model.enumeration.Hero.IGNISSA;
import static model.enumeration.Hero.ILLOR;
import static model.enumeration.Hero.IONA;
import static model.enumeration.Hero.ISRA;
import static model.enumeration.Hero.IVOR;
import static model.enumeration.Hero.JABARKAS;
import static model.enumeration.Hero.JAEGAR;
import static model.enumeration.Hero.JEDDITE;
import static model.enumeration.Hero.JENOVA;
import static model.enumeration.Hero.JEREMY;
import static model.enumeration.Hero.JOSEPHINE;
import static model.enumeration.Hero.KALT;
import static model.enumeration.Hero.KORBAC;
import static model.enumeration.Hero.KRELLION;
import static model.enumeration.Hero.KYRRE;
import static model.enumeration.Hero.LACUS;
import static model.enumeration.Hero.LORELEI;
import static model.enumeration.Hero.LUNA;
import static model.enumeration.Hero.LYONIS;
import static model.enumeration.Hero.MALEKITH;
import static model.enumeration.Hero.MARIUS;
import static model.enumeration.Hero.MEPHALA;
import static model.enumeration.Hero.MIRIAM;
import static model.enumeration.Hero.MOANDOR;
import static model.enumeration.Hero.MONERE;
import static model.enumeration.Hero.NAGASH;
import static model.enumeration.Hero.NEELA;
import static model.enumeration.Hero.NYMUS;
import static model.enumeration.Hero.ORIN;
import static model.enumeration.Hero.PASIS;
import static model.enumeration.Hero.PIQUE;
import static model.enumeration.Hero.PYRE;
import static model.enumeration.Hero.RANLOO;
import static model.enumeration.Hero.RISSA;
import static model.enumeration.Hero.ROSIC;
import static model.enumeration.Hero.SANDRO;
import static model.enumeration.Hero.SHAKTI;
import static model.enumeration.Hero.SHIVA;
import static model.enumeration.Hero.SOLMYR;
import static model.enumeration.Hero.SORSHA;
import static model.enumeration.Hero.SPINT;
import static model.enumeration.Hero.STRAKER;
import static model.enumeration.Hero.SYLVIA;
import static model.enumeration.Hero.TAMIKA;
import static model.enumeration.Hero.TAZAR;
import static model.enumeration.Hero.THANT;
import static model.enumeration.Hero.THUNAR;
import static model.enumeration.Hero.TYRAXOR;
import static model.enumeration.Hero.TYRIS;
import static model.enumeration.Hero.VALESKA;
import static model.enumeration.Hero.VIDOMINA;
import static model.enumeration.Hero.VOKIAL;
import static model.enumeration.Hero.VOY;
import static model.enumeration.Hero.WYSTAN;
import static model.enumeration.Hero.YOG;
import static model.enumeration.Hero.ZYDAR;
import model.enumeration.Fraction;
import model.enumeration.Hero;

public class ArmyService {
    private static final Map<Fraction, List<Hero>> HEROES = Map.of(
        CASTLE, List.of(ORIN, VALESKA, EDRIC, SYLVIA, SORSHA, TYRIS, LYONIS),
        BASTION, List.of(MEPHALA, JENOVA, GISELLE, IVOR, CLANCY, KYRRE, ELLESHAR, AERIS),
        TOWER, List.of(PIQUE, JOSEPHINE, NEELA, FAFNER, RISSA, IONA, SOLMYR),
        INFERNO, List.of(FIONA, MARIUS, IGNATIUS, CALH, PYRE, NYMUS, AYDEN, ZYDAR),
        NECROPOLIS, List.of(STRAKER, RANLOO, VOKIAL, MOANDOR, CHARNA, TAMIKA, ISRA, VIDOMINA, CLAVIUS, SANDRO, THANT, NAGASH),
        DUNGEON, List.of(LORELEI, ARLACH, DACE, AJIT, GUNNAR, SHAKTI, ALAMAR, JAEGAR, MALEKITH, JEDDITE, DEEMER),
        STRONGHOLD, List.of(YOG, GURNISSON, JABARKAS, SHIVA, GRETCHIN, KRELLION, CRAG_HACK, TYRAXOR, DESSA, GUNDULLA),
        FORTRESS, List.of(BRON, DRAKON, WYSTAN, TAZAR, ALKIN, KORBAC, GERWULF, BROGHILD, ROSIC, VOY),
        CONFLUX, List.of(PASIS, THUNAR, IGNISSA, LACUS, MONERE, ERDAMON, FIUR, KALT, LUNA, BRISSA),
        COVE, List.of(CORKES, JEREMY, ILLOR, ELMORE, ANABEL, CASSIO, MIRIAM, EOVACIUS, SPINT)
    );

    private final Random random;

    public ArmyService() {
        this.random = new Random();
    }

    public Hero rollHero(Hero bannedHero) {
        List<Hero> heroes = new ArrayList<>(findByChampion(bannedHero));
        heroes.remove(bannedHero);
        return rollHero(heroes);
    }

    public Hero rollHero(Fraction fraction) {
        return rollHero(HEROES.get(fraction));
    }

    private Hero rollHero(List<Hero> heroes) {
        return heroes.get(random.nextInt(heroes.size()));
    }

    private List<Hero> findByChampion(Hero hero) {
        return HEROES.values()
            .stream()
            .filter(champions -> champions
                .stream()
                .anyMatch(champion -> champion == hero))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }
}
