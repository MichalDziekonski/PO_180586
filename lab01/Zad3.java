import java.util.Scanner;

public class Zad3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        for (int i = 0; i < 10; i++){
            tab[i] = scanner.nextInt();
        }

        int min = tab[0];
        int max = tab[0];
        int sum = 0;
        double avg = 0;
        int avg2 = 0;


        for (int i = 0; i < 10; i++){
            if(tab[i] < min)
                min = tab[i];

            if(tab[i] > max)
                max = tab[i];

            sum += tab[i];
        }

        avg = sum/10;

        for (int i = 0; i < 10; i++){
            if(avg < tab[i])
                avg2++;
        }

        System.out.println("Najmiejsza liczba to: " + min);
        System.out.println("Najwieksza liczba to: " + max);
        System.out.println("Suma liczb to: " + sum);
        System.out.println("Srednia liczb to: " + avg);
        System.out.println("Ilosc liczb powyrzej sredniej to: " + avg2);

        scanner.close();
    }
}
