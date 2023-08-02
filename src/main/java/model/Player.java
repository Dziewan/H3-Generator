package model;

import model.enumeration.Color;
import model.enumeration.PlayerName;
import model.enumeration.ResetOrder;

public abstract class Player {
    protected final PlayerName name;
    protected final Army army;
    protected final Color color;
    protected final ResetOrder resetOrder;

    public Player(PlayerName name, Army army, Color color, ResetOrder resetOrder) {
        this.name = name;
        this.army = army;
        this.color = color;
        this.resetOrder = resetOrder;
    }

    public PlayerName getName() {
        return name;
    }

    public Army getArmy() {
        return army;
    }

    public Color getColor() {
        return color;
    }

    public ResetOrder getResetOrder() {
        return resetOrder;
    }
}
