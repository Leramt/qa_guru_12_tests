package utils;

public enum GenderClass {
    MALE(1),
    FEMALE(2),
    OTHER(3);

    public final int id;

    GenderClass(int id) {
        this.id = id;
    }
}
