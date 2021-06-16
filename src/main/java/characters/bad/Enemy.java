package characters.bad;

import characters.Player;

public abstract class Enemy extends Player {


    public Enemy(String name, double healthPoints){
        super(name, healthPoints);
    }

    public void takeDamage(double damage){
        this.setHealthPoints(this.getHealthPoints() - damage);
    }
}