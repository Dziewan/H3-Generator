package model;

public record Match(Player firstPlayer, Player secondPlayer) {
    @Override
    public String toString() {
        return String.format("%s vs %s\n%s (%s) vs %s (%s)\n%s : %s\n%s : %s\n",
            firstPlayer.getName(),
            secondPlayer.getName(),
            firstPlayer.getArmy().fraction(),
            firstPlayer.getArmy().hero().name(),
            secondPlayer.getArmy().fraction(),
            secondPlayer.getArmy().hero().name(),
            firstPlayer.getColor(),
            secondPlayer.getColor(),
            firstPlayer.getResetOrder(),
            secondPlayer.getResetOrder());
    }
}
