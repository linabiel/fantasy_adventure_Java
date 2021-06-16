package characters.bad;

import weapons.WeaponsType;

public class Orc extends Enemy {

    private WeaponsType weaponsType;
    private double damageMultiplier;

    public Orc(String name, double healthPoints, WeaponsType weaponsType, double damageMultiplier) {
        super(name, healthPoints, weaponsType, damageMultiplier);
        this.weaponsType = WeaponsType.STICK;
        this.damageMultiplier = 1;
    }

}
