package characters.good;

import behaviours.IWeapon;
import characters.Player;
import characters.bad.Enemy;
import weapons.WeaponsType;

public class Elf extends Fighter implements IWeapon {

    private WeaponsType weaponsType;
    private double damageMultiplier;

    public Elf(String name, double healthPoints, WeaponsType weaponType, double damageMultiplier) {
        super(name, healthPoints);
        this.weaponsType = WeaponsType.BOW;
        this.damageMultiplier = 1.5;
    }

    public WeaponsType getWeapon() {
        return weaponsType;
    }

    public double getDamageAmount(){
        return this.getWeapon().getDamage() * damageMultiplier;
    }

    public void attack(Player player){
        player.takeDamage(this.getDamageAmount());
    }

}
