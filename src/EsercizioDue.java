import java.util.*;

public class EsercizioDue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Quanti valori vuoi inserire?");
        int n = scanner.nextInt();

        //TreeSet ordina gli elementi automaticamente
        SortedSet<Integer> numbers = new TreeSet<>();

        for(int i = 0; i< n; i++){
            int number = random.nextInt(101);
            numbers.add(number);
        }
        System.out.println("---");
        System.out.println("Stampa numeri in ordine crescente");
       for(int number : numbers) {

           System.out.println(number);
       }
        System.out.println("---");
       //Trasformiamo Set in una lista così è possibile applicare il metodo reverse
        List<Integer> numberList = new ArrayList<>(numbers);
        System.out.println("Stampa i numeri in ordine decrescente");

        Collections.reverse(numberList);
        System.out.println(numberList);

        System.out.println("---");

        //lista che può contenere Boolean eed una lista
        List<Object> mixedList = new ArrayList<>();

        System.out.println("True o false?");
        boolean oddEven = scanner.nextBoolean();

        mixedList.add(oddEven);
        mixedList.add(numbers);

       // System.out.println(mixedList);

        if (oddEven) {
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        } else  {
            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
        }

        scanner.close();
    }
}}
