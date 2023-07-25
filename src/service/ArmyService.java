package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import static model.enumeration.Building.BASTION;
import static model.enumeration.Building.CASTLE;
import static model.enumeration.Building.CONFLUX;
import static model.enumeration.Building.COVE;
import static model.enumeration.Building.DUNGEON;
import static model.enumeration.Building.FORTRESS;
import static model.enumeration.Building.INFERNO;
import static model.enumeration.Building.NECROPOLIS;
import static model.enumeration.Building.STRONGHOLD;
import static model.enumeration.Building.TOWER;
import static model.enumeration.Champion.AERIS;
import static model.enumeration.Champion.AJIT;
import static model.enumeration.Champion.ALAMAR;
import static model.enumeration.Champion.ALKIN;
import static model.enumeration.Champion.ANABEL;
import static model.enumeration.Champion.ARLACH;
import static model.enumeration.Champion.AYDEN;
import static model.enumeration.Champion.BRISSA;
import static model.enumeration.Champion.BROGHILD;
import static model.enumeration.Champion.BRON;
import static model.enumeration.Champion.CALH;
import static model.enumeration.Champion.CASSIO;
import static model.enumeration.Champion.CHARNA;
import static model.enumeration.Champion.CLANCY;
import static model.enumeration.Champion.CLAVIUS;
import static model.enumeration.Champion.CORKES;
import static model.enumeration.Champion.CRAG_HACK;
import static model.enumeration.Champion.DACE;
import static model.enumeration.Champion.DEEMER;
import static model.enumeration.Champion.DESSA;
import static model.enumeration.Champion.DRAKON;
import static model.enumeration.Champion.EDAMON;
import static model.enumeration.Champion.EDRIC;
import static model.enumeration.Champion.ELLESHAR;
import static model.enumeration.Champion.ELMORE;
import static model.enumeration.Champion.EOVACIUS;
import static model.enumeration.Champion.FAFNER;
import static model.enumeration.Champion.FIONA;
import static model.enumeration.Champion.FIUR;
import static model.enumeration.Champion.GISELLE;
import static model.enumeration.Champion.GRETCHIN;
import static model.enumeration.Champion.GRWULF;
import static model.enumeration.Champion.GUNDULLA;
import static model.enumeration.Champion.GUNNAR;
import static model.enumeration.Champion.GURNISSON;
import static model.enumeration.Champion.IGNATIUS;
import static model.enumeration.Champion.IGNISSA;
import static model.enumeration.Champion.ILLOR;
import static model.enumeration.Champion.IONA;
import static model.enumeration.Champion.ISRA;
import static model.enumeration.Champion.IVOR;
import static model.enumeration.Champion.JABARKAS;
import static model.enumeration.Champion.JAEGAR;
import static model.enumeration.Champion.JEDDITE;
import static model.enumeration.Champion.JENOVA;
import static model.enumeration.Champion.JEREMY;
import static model.enumeration.Champion.JOSEPHINE;
import static model.enumeration.Champion.KALT;
import static model.enumeration.Champion.KORBAC;
import static model.enumeration.Champion.KRELLION;
import static model.enumeration.Champion.KYRRE;
import static model.enumeration.Champion.LACUS;
import static model.enumeration.Champion.LORELEI;
import static model.enumeration.Champion.LUNA;
import static model.enumeration.Champion.LYONIS;
import static model.enumeration.Champion.MALEKITH;
import static model.enumeration.Champion.MARIUS;
import static model.enumeration.Champion.MEPHALA;
import static model.enumeration.Champion.MIRIAM;
import static model.enumeration.Champion.MOANDOR;
import static model.enumeration.Champion.MONERE;
import static model.enumeration.Champion.NAGASH;
import static model.enumeration.Champion.NEELA;
import static model.enumeration.Champion.NYMUS;
import static model.enumeration.Champion.ORIN;
import static model.enumeration.Champion.PASIS;
import static model.enumeration.Champion.PIQUE;
import static model.enumeration.Champion.PYRE;
import static model.enumeration.Champion.RANLOO;
import static model.enumeration.Champion.RISSA;
import static model.enumeration.Champion.ROSIC;
import static model.enumeration.Champion.SANDRO;
import static model.enumeration.Champion.SHAKTI;
import static model.enumeration.Champion.SHIVA;
import static model.enumeration.Champion.SOLMYR;
import static model.enumeration.Champion.SORSHA;
import static model.enumeration.Champion.SPINT;
import static model.enumeration.Champion.STRAKER;
import static model.enumeration.Champion.SYLVIA;
import static model.enumeration.Champion.TAMIKA;
import static model.enumeration.Champion.TAZAR;
import static model.enumeration.Champion.THANT;
import static model.enumeration.Champion.THUNAR;
import static model.enumeration.Champion.TYRAXOR;
import static model.enumeration.Champion.TYRIS;
import static model.enumeration.Champion.VALESKA;
import static model.enumeration.Champion.VIDOMINA;
import static model.enumeration.Champion.VOKIAL;
import static model.enumeration.Champion.VOY;
import static model.enumeration.Champion.WYSTAN;
import static model.enumeration.Champion.YOG;
import static model.enumeration.Champion.ZYDAR;
import model.enumeration.Building;
import model.enumeration.Champion;

public class ArmyService {
    private static final Map<Building, List<Champion>> HEROES = Map.of(
        CASTLE, List.of(ORIN, VALESKA, EDRIC, SYLVIA, SORSHA, TYRIS, LYONIS),
        BASTION, List.of(MEPHALA, JENOVA, GISELLE, IVOR, CLANCY, KYRRE, ELLESHAR, AERIS),
        TOWER, List.of(PIQUE, JOSEPHINE, NEELA, FAFNER, RISSA, IONA, SOLMYR),
        INFERNO, List.of(FIONA, MARIUS, IGNATIUS, CALH, PYRE, NYMUS, AYDEN, ZYDAR),
        NECROPOLIS, List.of(STRAKER, RANLOO, VOKIAL, MOANDOR, CHARNA, TAMIKA, ISRA, VIDOMINA, CLAVIUS, SANDRO, THANT, NAGASH),
        DUNGEON, List.of(LORELEI, ARLACH, DACE, AJIT, GUNNAR, SHAKTI, ALAMAR, JAEGAR, MALEKITH, JEDDITE, DEEMER),
        STRONGHOLD, List.of(YOG, GURNISSON, JABARKAS, SHIVA, GRETCHIN, KRELLION, CRAG_HACK, TYRAXOR, DESSA, GUNDULLA),
        FORTRESS, List.of(BRON, DRAKON, WYSTAN, TAZAR, ALKIN, KORBAC, GRWULF, BROGHILD, ROSIC, VOY),
        CONFLUX, List.of(PASIS, THUNAR, IGNISSA, LACUS, MONERE, EDAMON, FIUR, KALT, LUNA, BRISSA),
        COVE, List.of(CORKES, JEREMY, ILLOR, ELMORE, ANABEL, CASSIO, MIRIAM, EOVACIUS, SPINT)
    );

    private final Random random;

    public ArmyService() {
        this.random = new Random();
    }

    public Champion rollHero(Champion bannedHero) {
        List<Champion> heroes = new ArrayList<>(findByChampion(bannedHero));
        heroes.remove(bannedHero);
        return rollHero(heroes);
    }

    public Champion rollHero(Building building) {
        return rollHero(HEROES.get(building));
    }

    private Champion rollHero(List<Champion> heroes) {
        return heroes.get(random.nextInt(heroes.size()));
    }

    private List<Champion> findByChampion(Champion hero) {
        return HEROES.values()
            .stream()
            .filter(champions -> champions
                .stream()
                .anyMatch(champion -> champion == hero))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }
}
