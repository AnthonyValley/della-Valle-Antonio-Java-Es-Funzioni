import java.util.Scanner;

public class Esercizio2 {
    public static int leggiSecondi() {
        Scanner scanner = new Scanner(System.in);
        int secondi;
        do {
            System.out.print("Inserisci il tempo in secondi (tra 0 e 84600): ");
            secondi = scanner.nextInt();
            if (secondi < 0 || secondi > 84600) {
                System.out.println("Valore non valido! Riprova.");
            }
        } while (secondi < 0 || secondi > 84600);
        return secondi;
    }

    public static void convertiTempo(int secondi) {
        int ore = secondi / 3600;
        int minuti = (secondi % 3600) / 60;
        int sec = secondi % 60;

        System.out.println(secondi + " s corrispondono a " + ore + " h, " + minuti + " m e " + sec + " s");
    }

    public static void main(String[] args) {
        int secondi = leggiSecondi();
        convertiTempo(secondi);
    }
}
