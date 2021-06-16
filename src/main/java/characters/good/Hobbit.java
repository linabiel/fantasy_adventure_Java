package characters.good;

import characters.Player;
import weapons.WeaponsType;

public class Hobbit extends Fighter implemets IWeapon {

    public Hobbit(String name, double healthPoints, WeaponsType weaponsType, double dama) {
        super(name, healthPoints);
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
