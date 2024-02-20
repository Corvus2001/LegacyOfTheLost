import java.util.ArrayList;
import java.util.Scanner;

/**
     * @author 
     * @author
     * 
     * Von hier aus wird das Spiel gestartete
     */


public class LFTLGame{
    private static Scanner scanner = new Scanner(System.in);

    private static boolean gameIsRunning = true;



    public static void main(String[] args) {
        while (gameIsRunning) {
            showStandardMenue();
            int choice= readUserInput();
            menue1(choice);
            System.out.println("================");
            
        }
        /**
         * nimmt Benutzereingabe von readUserInput entgegen und gibt zurück
         * 
         */}

        private static int readUserInput(){
            System.out.println("\ngeben Sie eine Nummer des Menüs ein:\t");
            int choiceInternal = scanner.nextInt();
            return choiceInternal;
        }

        private static void menue1(int choice){
            switch (choice) {
                case 1:
                //Dungeon oder Arema
                    break;
                //Inventory
                case 2:
                //Shop, kaufen verkaufen
                    break;
                //Spiel beenden
                case 3:
                    
            }
        }

        private static void showStandardMenue(){
            ArrayList<String> standardMenueArrayList = new ArrayList<>();
            standardMenueArrayList.add("Dungeon oder Arena");
            standardMenueArrayList.add("Inventory");
            standardMenueArrayList.add("Shop");
            standardMenueArrayList.add("Spiel beenden");

            System.out.println("===========");
            for(int i = 1; i< standardMenueArrayList.size(); i++){
                System.out.println(standardMenueArrayList.get(i));
            }

        }

        



}