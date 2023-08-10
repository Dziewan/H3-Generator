package model.api;

public record Match(Player playerOne, Player playerTwo, boolean onGoing, Integer season, String dateTime) {
}
