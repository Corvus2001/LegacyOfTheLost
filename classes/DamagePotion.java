package classes;

public class DamagePotion extends Items{

    int damageMultiplyer;

    //Konstruktor
    public DamagePotion(String name, int value, int damageMultiplyer) {
        super(name, value);
        this.damageMultiplyer= damageMultiplyer;
    }
}
