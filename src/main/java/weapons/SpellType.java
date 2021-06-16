package weapons;

public enum SpellType {

    FIREBALL(15),
    LIGHTNING(20),
    HEAL(10);

    private int power;

    SpellType(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
