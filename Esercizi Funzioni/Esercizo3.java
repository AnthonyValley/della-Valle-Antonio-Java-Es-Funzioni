import java.util.Scanner;

public class Esercizo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di prodotti venduti: ");
        int N = scanner.nextInt();

        int[] quantita = new int[4]; // 0: TV, 1: Frigoriferi, 2: Lavatrici, 3: Altro
        double[] ricavi = new double[4];
        double ricavoTotale = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci il tipo di prodotto (1: TV, 2: Frigorifero, 3: Lavatrice, 4: Altro): ");
            int tipo = scanner.nextInt();
            System.out.print("Inserisci il prezzo del prodotto: ");
            double prezzo = scanner.nextDouble();

            if (tipo >= 1 && tipo <= 4) {
                quantita[tipo - 1]++;
                ricavi[tipo - 1] += prezzo;
                ricavoTotale += prezzo;
            } else {
                System.out.println("Tipo non valido, riprova.");
                i--; // Ripeti l'iterazione
            }
        }

        System.out.println("\n--- Riepilogo Vendite ---");
        System.out.println("Ricavo totale: " + ricavoTotale + " euro");

        String[] categorie = {"Televisori", "Frigoriferi", "Lavatrici", "Altro"};
        
        for (int i = 0; i < 4; i++) {
            double percentualeQuantita = (N > 0) ? ((double) quantita[i] / N) * 100 : 0;
            double percentualeRicavo = (ricavoTotale > 0) ? (ricavi[i] / ricavoTotale) * 100 : 0;
            System.out.println(categorie[i] + ": ");
            System.out.println("  Quantità vendute: " + quantita[i] + " (" + String.format("%.2f", percentualeQuantita) + "%)");
            System.out.println("  Ricavo: " + ricavi[i] + " euro (" + String.format("%.2f", percentualeRicavo) + "%)");
        }
        
        scanner.close();
    }
}