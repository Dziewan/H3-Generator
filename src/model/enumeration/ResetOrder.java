package model.enumeration;

public enum ResetOrder {
    FIRST,
    SECOND;

    public ResetOrder getOpposite() {
        return this.name().equals(FIRST.name()) ? SECOND : FIRST;
    }
}
