package model.enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Building {
    CASTLE(2),
    BASTION(4),
    TOWER(9),
    INFERNO(3),
    NECROPOLIS(6),
    DUNGEON(5),
    STRONGHOLD(10),
    FORTRESS(7),
    CONFLUX(1),
    COVE(8);

    private final Integer priority;

    Building(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return priority;
    }

    public static List<Building> toList() {
        return new ArrayList<>(Arrays.stream(values()).toList());
    }
}
