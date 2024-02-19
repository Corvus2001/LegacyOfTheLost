package classes;

public class HealthPotion extends Items{
    //Attibute
    int healthMultiplyer;


    //Konstruktor
    public HealthPotion(String name, int value, int healthMultiplyer) {
        super(name, value);
        this.healthMultiplyer=healthMultiplyer;
    }


}
