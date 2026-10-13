import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //trzeba było dodać na koncu ; wykrywa kompilator

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { //trzeba zamiast = dac == wykrywa kompilator
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); //trzeba było dodać na koncu ; wykrywa kompilator
        }

        for (int i = 0; i <= 5; i++) { //trzeba zamienienic i-- na i++ poniewaz powstaje nieskonczona petla tego kompilator nie wykryje
            System.out.println(i);
        }

        scanner.close();
    }
}
