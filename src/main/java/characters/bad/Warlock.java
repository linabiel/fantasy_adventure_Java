package characters.bad;

import behaviours.ISpell;
import characters.Player;
import characters.good.Mage;
import weapons.SpellType;

public class Warlock extends Mage implements ISpell {

    private SpellType spell;
    private double maxHealth;

    public Warlock(String name, double healthPoints, double maxHealth, SpellType spell) {
        super(name, healthPoints, maxHealth, spell);
        this.spell = SpellType.FIREBALL;
        this.maxHealth = getHealthPoints();
    }

    public double getDamageAmount(){
        return this.spell.getPower();
    }

    public String cast(Player player){
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
