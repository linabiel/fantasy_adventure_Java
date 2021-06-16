import characters.bad.Orc;
import characters.good.Elf;
import characters.good.Wizard;
import org.junit.Before;
import org.junit.Test;
import weapons.SpellType;
import weapons.WeaponsType;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Elf elf;
    Orc orc;
    Orc almostDeadOrc;
    Wizard wizard;

    @Before
    public void before() {
        elf = new Elf("Legolas", 1000,1000, WeaponsType.BOW, 1.5);
        orc = new Orc("Grishnak", 100, 100,WeaponsType.STICK, 1);
        almostDeadOrc = new Orc("Argug", 10, 100,WeaponsType.STICK, 1);
        wizard = new Wizard("Gandalf", 1500, 1500, SpellType.HEAL);
    }

    @Test
    public void canHeal() {
        orc.attack(elf);
        orc.attack(elf);
        assertEquals(990, elf.getHealthPoints(), 0.00);
        wizard.cast(elf);
        assertEquals(1000, elf.getHealthPoints(),0.00);
    }

}
