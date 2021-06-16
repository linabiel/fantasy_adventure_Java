package characters.bad;

import behaviours.IWeapon;
import characters.Player;
import weapons.WeaponsType;

public abstract class Enemy extends Player {


    public Enemy(String name, double healthPoints){
        super(name, healthPoints);
    }

    public void takeDamage(double damage){
        this.setHealthPoints(this.getHealthPoints() - damage);
    }

    public WeaponsType getWeapon() {
        return weaponsType;
    }

    public double getDamageAmount(){
        return this.getWeapon().getDamage() * damageMultiplier;
    }

    public String attack(Player player){
        if (player.checkAlive(player)) {
            player.takeDamage(this.getDamageAmount());
            if (player.checkAlive(player) == false) {
                return player.isDead();
            } else {
                return "Ouch!";
            }
        } else {
            return player.isDead();
        }
    }
}