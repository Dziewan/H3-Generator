package model;

import model.enumeration.Color;
import model.enumeration.PlayerName;
import model.enumeration.ResetOrder;

public class Daniel extends Player {

    public Daniel(Army army, Color color, ResetOrder resetOrder) {
        super(PlayerName.DANIEL, army, color, resetOrder);
    }
}
