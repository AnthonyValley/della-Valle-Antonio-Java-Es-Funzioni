import java.util.Random;
import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Inserisci il nome della prima squadra: ");
        String squadra1 = scanner.nextLine();
        System.out.print("Inserisci il nome della seconda squadra: ");
        String squadra2 = scanner.nextLine();

        int goalSquadra1 = 0, goalSquadra2 = 0;
        int tiriEffettuati = 0;
        boolean spareggio = false;
        
        for (int i = 0; i < 5; i++) {
            if (eseguiTiro(squadra1, random)) goalSquadra1++;
            if (eseguiTiro(squadra2, random)) goalSquadra2++;
            tiriEffettuati += 2;
        }

        while (goalSquadra1 == goalSquadra2) {
            spareggio = true;
            if (eseguiTiro(squadra1, random)) goalSquadra1++;
            if (eseguiTiro(squadra2, random)) goalSquadra2++;
            tiriEffettuati += 2;
        }
        
        System.out.println("\n--- Risultato Finale ---");
        System.out.println("Squadra vincente: " + (goalSquadra1 > goalSquadra2 ? squadra1 : squadra2));
        System.out.println("Numero totale di tiri effettuati: " + tiriEffettuati);
        System.out.println(squadra1 + " - Goal: " + goalSquadra1);
        System.out.println(squadra2 + " - Goal: " + goalSquadra2);

        scanner.close();
    }

    private static boolean eseguiTiro(String squadra, Random random) {
        boolean goal = random.nextBoolean();
        System.out.println(squadra + " ha tirato: " + (goal ? "Goal!" : "Parato!"));
        return goal;
    }
}
