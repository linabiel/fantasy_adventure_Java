package characters.good;

import weapons.WeaponsType;

public class Elf extends Fighter implements IWeapon {

    private WeaponsType weaponsType;
    private double damageMultiplier;

    public Elf(String name, double healthPoints, WeaponsType weaponType, double damageMultiplier) {
        super(name, healthPoints);
        this.weaponsType = WeaponsType.BOW;
        this.damageMultiplier = 1.5;
        this.maxHealth = getHealthPoints();
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
