package model.enumeration;

public enum Color {
    RED,
    BLUE;

    public Color getOpposite() {
        return this.name().equals(RED.name()) ? BLUE : RED;
    }
}
