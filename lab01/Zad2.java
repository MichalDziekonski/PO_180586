import java.util.Scanner;

public class Zad2 {
     static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartosc liczby n musi byc nieujemna calkowita: ");
        int n = scanner.nextInt();
        int sum = 0;
        int sum2 = 0;

        if(n <= 0){
            System.out.println("Liczba n nie może być ujemna");
        }else {
            if(n % 2 == 0){
                System.out.println("Liczba jest parzysta");
            }else {
                System.out.println("Liczba nie jest parzysta");
            }

            if(n % 3 == 0){
                System.out.println("Liczba jest podzielna przez 3");
            }else {
                System.out.println("Liczba nie jest podzielna przez 3");
            }

            for (int i = 1; i <= n; i++){
                sum += i;
            }

            System.out.println("suma liczb to: " + sum);


            for (int i = 1; i <= n; i++){
                if(i % 2 == 0)
                    sum2 += 1;
            }


            System.out.println("ilosc liczb parzystych to: " + sum2);
        }

        scanner.close();
    }
}
