package classes;
import java.util.Scanner;

public class Player {

    private static Scanner scanner = new Scanner(System.in);

    //Attribute
    String name;
    int experiencePoints;
    int healthPointsCurrent;
    int healthPointsMax;
    int coins;
    int successfullCompletedAdventures;
    boolean isAlive;

    //Konstruktor
public Player(){};




public void playerCreation(){

    System.out.println("Willkommen bei der Charakter erstellung. Bevor du dich in Abenteuer stürzen kannst brauchen wir ein paar informationen von dir\nGib den Namen deines Charakters ein");
    scanner.nextLine();
    String playerName= scanner.nextLine();


    System.out.println("Dein Name ist "+playerName+" und dein Charakter ist ein ++Rolle einfügen++");
    


}

}
