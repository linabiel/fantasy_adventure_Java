package characters;

public abstract class Player {

    private String name;
    private double healthPoints;

    public Player(String name, double healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public void takeDamage(double damage){
        if (this.healthPoints - damage <= 0){
            this.healthPoints = 0;
        }
        else {
            this.healthPoints -= damage;
        }
    }

    public String getName() {
        return name;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints){
        this.healthPoints = healthPoints;
    }
}
