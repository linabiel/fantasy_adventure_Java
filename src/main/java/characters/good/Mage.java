package characters.good;

import behaviours.ISpell;
import characters.Player;
import weapons.SpellType;

public abstract class Mage extends Player implements ISpell {

    private SpellType spell;
    private double maxHealth;

    public Mage(String name, double healthPoints, double maxHealth, SpellType spell) {
        super(name, healthPoints, maxHealth);
        this.spell = spell;
        this.maxHealth = maxHealth;
    }

}
