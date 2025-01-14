import java.util.HashMap;

public class EsercizioTre {

    public static void main (String[] arg){
        //HashMap che contine nome-numero di telefono
        HashMap<String, String > phoneBook = new HashMap<>();

        phoneBook.put("Mario", "333 33 33 333");
        phoneBook.put("Luigi", "333 33 33 333");
        phoneBook.put("Jeo", "+ 443 33 33 333");
        phoneBook.put("Zoe", "+ 133 33 33 333");

        System.out.println(phoneBook);

        System.out.println("rimuoviamo un contatto");
        phoneBook.remove("Luigi");
        System.out.println(phoneBook);




    }
}
