import java.util.Scanner;

public class Main {

    public static void main (String []args) {

        System.out.println("Czesc swiecie");
        int liczba;
        liczba = 10;
        System.out.println(liczba);

        String tablica[]=  new String[5];
        System.out.println(tablica[2]);


        int pierwszaLiczba = 5;
        int drugaLiczba = 2;
        String smietnik;

        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

        System.out.println("Podaj pierwsza liczbe");

        /*
        if(odczyt.hasNextInt()) {
            pierwszaLiczba = odczyt.nextInt();
        }
        else
            System.out.println("to nie jest liczba");
            smietnik = odczyt.next();
            System.out.println("Podaj pierwsza liczbe");
          */
        while(odczyt.hasNextInt() == false) {
            System.out.println("to nie jest liczba");
            odczyt.
            System.out.println("Podaj pierwsza liczbe");
        }
        pierwszaLiczba = odczyt.nextInt();

        System.out.println("Podaj druga liczbe");

        while(odczyt.hasNextInt() == false) {
            System.out.println("to nie jest liczba");
            smietnik = odczyt.next();
            System.out.println("Podaj  druga liczbe");
        }

        drugaLiczba = odczyt.nextInt();

        int dodawanie = pierwszaLiczba + drugaLiczba;
        int odejmowanie = pierwszaLiczba - drugaLiczba;
        int mnozenie = pierwszaLiczba * drugaLiczba;
        int dzielenie = pierwszaLiczba / drugaLiczba;
        int reszta = pierwszaLiczba % drugaLiczba;

        System.out.println("wynik dodawania ="+ dodawanie);
        System.out.println("wynik odejmowania ="+ odejmowanie);
        System.out.println("wynik mnozenia ="+ mnozenie);
        System.out.println("wynik dzielenia = "+ dzielenie + " reszta " +reszta);

        System.out.println(odczyt.hasNextInt());


    }
}
