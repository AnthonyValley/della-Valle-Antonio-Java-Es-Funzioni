import java.util.Scanner;

public class Esercizio1 {
    public static void stampaRiga(int n) {
        char simbolo = (n % 2 == 0) ? '*' : '#';
        System.out.print(n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Scrivi il numero: ");
            numero = scanner.nextInt();
            if (numero > 0) {
                stampaRiga(numero);
            }
        } while (numero != 0);

        scanner.close();
    }
}
