import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz imie");
        String imie = scanner.next();
        System.out.println("Wprowadz nazwisko");
        String nazwisko = scanner.next();
        System.out.println("Wprowadz wartosc wiek");
        int wiek = scanner.nextInt();
        if (wiek > 18) {
            System.out.println("mozesz wejsc");
        }else {
            System.out.println("za mlody aby wejsc");
        }

    }
}