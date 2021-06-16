package characters.good;

import weapons.WeaponsType;

public class Hobbit extends Fighter implemets IWeapon {

    public Hobbit(String name, double healthPoints, WeaponsType weaponsType, double damageMultiplier) {
        super(name, healthPoints, weaponsType, damageMultiplier);
        this.weaponsType = WeaponsType.SWORD;
        this.damageMultiplier = 0.75;
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
}
