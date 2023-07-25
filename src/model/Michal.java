package model;

import model.enumeration.Color;
import model.enumeration.PlayerName;
import model.enumeration.ResetOrder;

public class Michal extends Player {
    public Michal(Army army, Color color, ResetOrder resetOrder) {
        super(PlayerName.MICHAL, army, color, resetOrder);
    }
}
