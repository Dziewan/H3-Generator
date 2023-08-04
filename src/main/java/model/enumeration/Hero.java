package model.enumeration;

import model.SkillSet;

import java.util.Optional;

import static model.enumeration.Skill.*;
import static model.enumeration.SkillLevel.*;
import static model.enumeration.Spec.*;
import static model.enumeration.Spec.ARCHERY;
import static model.enumeration.Spec.ARMORER;
import static model.enumeration.Spec.INTELLIGENCE;
import static model.enumeration.Spec.INTERFERENCE;
import static model.enumeration.Spec.LOGISTICS;
import static model.enumeration.Spec.MYSTICISM;
import static model.enumeration.Spec.NAVIGATION;
import static model.enumeration.Spec.NECROMANCY;
import static model.enumeration.Spec.OFFENCE;
import static model.enumeration.Spec.SCOUTING;
import static model.enumeration.Spec.SORCERY;

public enum Hero {

    //CASTLE
    ORIN(ARCHERY, new SkillSet(Skill.LEADERSHIP, BASIC), new SkillSet(Skill.ARCHERY, BASIC)),
    VALESKA(ARCHERS, new SkillSet(Skill.LEADERSHIP, BASIC), new SkillSet(Skill.ARCHERY, BASIC)),
    EDRIC(GRIFFINS, new SkillSet(Skill.LEADERSHIP, BASIC), new SkillSet(Skill.ARMORER, BASIC)),
    SYLVIA(NAVIGATION, new SkillSet(Skill.LEADERSHIP, BASIC), new SkillSet(Skill.NAVIGATION, BASIC)),
    SORSHA(SWORDSMEN, new SkillSet(Skill.LEADERSHIP, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),
    TYRIS(CAVALIERS, new SkillSet(Skill.LEADERSHIP, BASIC), new SkillSet(Skill.TACTICS, BASIC)),
    LYONIS(PRAYER, new SkillSet(Skill.WISDOM, BASIC), new SkillSet(Skill.LEARNING, BASIC)),

    //BASTION
    MEPHALA(ARMORER, new SkillSet(Skill.LEADERSHIP, BASIC), new SkillSet(Skill.ARMORER, BASIC)),
    JENOVA(GOLD_350, new SkillSet(Skill.ARCHERY, ADVANCED), null),
    GISELLE(INTERFERENCE, new SkillSet(Skill.INTERFERENCE, ADVANCED), null),
    IVOR(ELVES, new SkillSet(Skill.ARCHERY, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),
    CLANCY(UNICORNS, new SkillSet(Skill.INTERFERENCE, BASIC), new SkillSet(PATHFINDING, BASIC)),
    KYRRE(LOGISTICS, new SkillSet(Skill.LOGISTICS, BASIC), new SkillSet(Skill.ARCHERY, BASIC)),
    ELLESHAR(INTELLIGENCE, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.INTELLIGENCE, BASIC)),
    AERIS(PEGASI, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.SCOUTING, BASIC)),

    //TOWER
    PIQUE(GARGOYLES, new SkillSet(Skill.MYSTICISM, BASIC), new SkillSet(Skill.SCOUTING, BASIC)),
    JOSEPHINE(GOLEMS, new SkillSet(Skill.MYSTICISM, BASIC), new SkillSet(Skill.SORCERY, BASIC)),
    NEELA(ARMORER, new SkillSet(SCHOLAR, BASIC), new SkillSet(Skill.ARMORER, BASIC)),
    FAFNER(NAGAS, new SkillSet(SCHOLAR, BASIC), new SkillSet(Skill.INTERFERENCE, BASIC)),
    RISSA(MERCURY, new SkillSet(Skill.MYSTICISM, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),
    IONA(GENIES, new SkillSet(SCHOLAR, BASIC), new SkillSet(Skill.INTELLIGENCE, BASIC)),
    SOLMYR(CHAIN_LIGHTNING, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.SORCERY, BASIC)),

    //INFERNO
    FIONA(HOUNDS, new SkillSet(Skill.SCOUTING, ADVANCED), null),
    MARIUS(DEMONS, new SkillSet(Skill.ARMORER, ADVANCED), null),
    IGNATIUS(IMPS, new SkillSet(TACTICS, BASIC), new SkillSet(Skill.INTERFERENCE, BASIC)),
    CALH(GOGS, new SkillSet(Skill.ARCHERY, BASIC), new SkillSet(Skill.SCOUTING, BASIC)),
    PYRE(BALLISTA, new SkillSet(Skill.LOGISTICS, BASIC), new SkillSet(ARTILLERY, BASIC)),
    NYMUS(PIT_FIENDS, new SkillSet(Skill.OFFENCE, ADVANCED), null),
    AYDEN(INTELLIGENCE, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.INTELLIGENCE, BASIC)),
    ZYDAR(SORCERY, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.SORCERY, BASIC)),

    //NECROPOLIS
    STRAKER(WALKING_DEAD, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(Skill.INTERFERENCE, BASIC)),
    RANLOO(BALLISTA, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(ARTILLERY, BASIC)),
    VOKIAL(VAMPIRES, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(ARTILLERY, BASIC)),
    MOANDOR(LICHES, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(Skill.LEARNING, BASIC)),
    CHARNA(WIGHTS, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(TACTICS, BASIC)),
    TAMIKA(BLACK_KNIGHTS, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),
    ISRA(NECROMANCY, new SkillSet(Skill.NECROMANCY, ADVANCED), null),
    VIDOMINA(NECROMANCY, new SkillSet(Skill.NECROMANCY, ADVANCED), null),
    CLAVIUS(GOLD_350, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),
    SANDRO(SORCERY, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(Skill.SORCERY, BASIC)),
    THANT(ANIMATE_DEAD, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(Skill.MYSTICISM, BASIC)),
    NAGASH(GOLD_350, new SkillSet(Skill.NECROMANCY, BASIC), new SkillSet(Skill.INTELLIGENCE, BASIC)),

    //DUNGEON
    LORELEI(HARPIES, new SkillSet(LEADERSHIP, BASIC), new SkillSet(Skill.SCOUTING, BASIC)),
    ARLACH(BALLISTA, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(ARTILLERY, BASIC)),
    DACE(MINOTAURS, new SkillSet(TACTICS, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),
    AJIT(BEHOLDERS, new SkillSet(LEADERSHIP, BASIC), new SkillSet(Skill.INTERFERENCE, BASIC)),
    GUNNAR(LOGISTICS, new SkillSet(TACTICS, BASIC), new SkillSet(Skill.LOGISTICS, BASIC)),
    SHAKTI(TROGLODYTES, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(TACTICS, BASIC)),
    ALAMAR(RESURRECTION, new SkillSet(WISDOM, BASIC), new SkillSet(SCHOLAR, BASIC)),
    JAEGAR(MYSTICISM, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.MYSTICISM, BASIC)),
    MALEKITH(SORCERY, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.SORCERY, BASIC)),
    JEDDITE(RESURRECTION, new SkillSet(WISDOM, ADVANCED), null),
    DEEMER(METEOR_SHOWER, new SkillSet(Skill.SCOUTING, BASIC), new SkillSet(WISDOM, BASIC)),

    //STRONGHOLD
    YOG(CYCLOPES, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(BALLISTICS, BASIC)),
    GURNISSON(BALLISTA, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(ARTILLERY, BASIC)),
    JABARKAS(ORCS, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(Skill.ARCHERY, BASIC)),
    SHIVA(ROCS, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(Skill.SCOUTING, BASIC)),
    GRETCHIN(GOBLINS, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(PATHFINDING, BASIC)),
    KRELLION(OGRES, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(Skill.INTERFERENCE, BASIC)),
    CRAG_HACK(OFFENCE, new SkillSet(Skill.OFFENCE, ADVANCED), null),
    TYRAXOR(WOLF_RIDERS, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(TACTICS, BASIC)),
    DESSA(LOGISTICS, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.LOGISTICS, BASIC)),
    GUNDULLA(OFFENCE, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),

    //FORTRESS
    BRON(BASILISKS, new SkillSet(Skill.ARMORER, BASIC), new SkillSet(Skill.INTERFERENCE, BASIC)),
    DRAKON(GNOLLS, new SkillSet(Skill.ARMORER, BASIC), new SkillSet(LEADERSHIP, BASIC)),
    WYSTAN(LIZARDMEN, new SkillSet(Skill.ARMORER, BASIC), new SkillSet(Skill.ARCHERY, BASIC)),
    TAZAR(ARMORER, new SkillSet(Skill.ARMORER, ADVANCED), null),
    ALKIN(GORGONS, new SkillSet(Skill.ARMORER, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),
    KORBAC(SERPENT_FLIES, new SkillSet(Skill.ARMORER, BASIC), new SkillSet(PATHFINDING, BASIC)),
    GERWULF(BALLISTA, new SkillSet(Skill.ARMORER, BASIC), new SkillSet(ARTILLERY, BASIC)),
    BROGHILD(WYVERNS, new SkillSet(Skill.ARMORER, BASIC), new SkillSet(Skill.SCOUTING, BASIC)),
    ROSIC(MYSTICISM, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.MYSTICISM, BASIC)),
    VOY(NAVIGATION, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.NAVIGATION, BASIC)),

    //CONFLUX
    PASIS(PSYCHIC_ELEMENTALS, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(ARTILLERY, BASIC)),
    THUNAR(EARTH_ELEMENTALS, new SkillSet(TACTICS, BASIC), new SkillSet(Skill.ESTATES, BASIC)),
    IGNISSA(FIRE_ELEMENTALS, new SkillSet(ARTILLERY, BASIC), new SkillSet(Skill.OFFENCE, BASIC)),
    LACUS(WATER_ELEMENTALS, new SkillSet(TACTICS, ADVANCED), null),
    MONERE(PSYCHIC_ELEMENTALS, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(Skill.LOGISTICS, BASIC)),
    ERDAMON(EARTH_ELEMENTALS, new SkillSet(TACTICS, BASIC), new SkillSet(Skill.ESTATES, BASIC)),
    FIUR(FIRE_ELEMENTALS, new SkillSet(Skill.OFFENCE, ADVANCED), null),
    KALT(WATER_ELEMENTALS, new SkillSet(TACTICS, BASIC), new SkillSet(Skill.LEARNING, BASIC)),
    LUNA(FIRE_WALL, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.FIRE_MAGIC, BASIC)),
    BRISSA(HASTE, new SkillSet(WISDOM, BASIC), new SkillSet(AIR_MAGIC, BASIC)),

    //COVE
    CORKES(OFFENCE, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(PATHFINDING, BASIC)),
    JEREMY(CANNON, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(ARTILLERY, BASIC)),
    ILLOR(STORMBIRDS, new SkillSet(Skill.ARMORER, BASIC), new SkillSet(TACTICS, BASIC)),
    ELMORE(NAVIGATION, new SkillSet(Skill.NAVIGATION, ADVANCED), null),
    ANABEL(PIRATES, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(Skill.ARCHERY, BASIC)),
    CASSIO(NYMPHS, new SkillSet(Skill.OFFENCE, BASIC), new SkillSet(TACTICS, BASIC)),
    MIRIAM(SCOUTING, new SkillSet(Skill.LOGISTICS, BASIC), new SkillSet(Skill.SCOUTING, BASIC)),
    EOVACIUS(CLONE, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.INTELLIGENCE, BASIC)),
    SPINT(SORCERY, new SkillSet(WISDOM, BASIC), new SkillSet(Skill.SORCERY, BASIC));

    private final Spec spec;
    private final SkillSet primarySkillset;
    private final SkillSet secondarySkillSet;

    Hero(Spec spec, SkillSet primarySkillset, SkillSet secondarySkillSet) {
        this.spec = spec;
        this.primarySkillset = primarySkillset;
        this.secondarySkillSet = secondarySkillSet;
    }

    public Spec getSpec() {
        return spec;
    }

    public SkillSet getPrimarySkillset() {
        return primarySkillset;
    }

    public SkillSet getSecondarySkillSet() {
        return secondarySkillSet;
    }

    @Override
    public String toString() {
        return String.format("Hero=[%s]\nSpec=[%s]\nPrimary Skill=[%s %s]\nSecondary Skill=[%s %s]\n",
            this.name(),
            this.spec,
            this.primarySkillset.skill(),
            this.primarySkillset.level(),
            Optional.ofNullable(this.secondarySkillSet).map(SkillSet::skill).orElse(EMPTY),
            Optional.ofNullable(this.secondarySkillSet).map(skillSet -> skillSet.level().toString()).orElse(""));
    }
}
