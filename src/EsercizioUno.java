import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EsercizioUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creo gli "array" vuoti, uno per tutte le parole w uno per i duplicati
        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        System.out.println("Quante parole vuoi inserire?");
        int n = scanner.nextInt();

        System.out.println("---");

        System.out.println("Inserisci le parole:");

        //ripetiamo il ciclo  n volte,dove n è il numero scelto dall'utente
        for (int i = 0; i < n; i++) {
            //nuova parola
            String word = scanner.nextLine();
            //se la parla non vine aggiunta a words allora la aggiungiamo a duplicates
            if (!words.add(word)) {
                duplicates.add(word);
            }
        }

        // Stampa parole duplicate
        System.out.println("Parole duplicate:");
        if (duplicates.isEmpty()) {
            System.out.println("Nessuna parola duplicata.");
        } else {
            for (String duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }

        // Stampa il numero di parole inserite
        System.out.println("Numero totale di parole inserite: " + n);

        // Stampa l'elenco delle parole distinte
        System.out.println("Elenco delle parole distinte:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
