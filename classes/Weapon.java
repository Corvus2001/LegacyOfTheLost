package classes;

public class Weapon extends Items {

    //Attribute
    int baseDamage;
    //Konstruktor leitet an SuperKlasse weiter
    public Weapon(String name, int value, int baseDamage) {
        super(name, value);
        this.baseDamage =baseDamage;
    }
}
