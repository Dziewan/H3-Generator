package model;

public class Match {
    private final Player firstPlayer;
    private final Player secondPlayer;

    public Match(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    @Override
    public String toString() {
        return String.format("%s vs %s\n%s (%s) vs %s (%s)\n%s : %s\n%s : %s",
            firstPlayer.getName(),
            secondPlayer.getName(),
            firstPlayer.getArmy().building(),
            firstPlayer.getArmy().champion(),
            secondPlayer.getArmy().building(),
            secondPlayer.getArmy().champion(),
            firstPlayer.getColor(),
            secondPlayer.getColor(),
            firstPlayer.getResetOrder(),
            secondPlayer.getResetOrder());
    }
}