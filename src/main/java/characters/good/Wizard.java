package characters.good;

import behaviours.ISpell;
import characters.Player;
import weapons.SpellType;

public class Wizard extends Mage implements ISpell {

    private SpellType spell;
    private double maxHealth;

    public Wizard(String name, double healthPoints, double maxHealth, SpellType spell) {
        super(name, healthPoints, maxHealth, spell);
        this.spell = SpellType.HEAL;
        this.maxHealth = getHealthPoints();
    }

    public String cast(Player player){
        player.heal(spell.getPower());
        return "I feel much better!";
    }


}
