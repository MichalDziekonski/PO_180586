import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //zad2();
        //zad3();
        //zad4();
        //zad5();
        //zad6();
        //zad7();
        //zad8();
        //zad9();
        //zad11();
        zad12();
    }

    static void zad2(){
        Person p1 = new Person("Michal", 22, "123456@student.uwm.edu.pl");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());
        //Bledne dane
        p1.setName("");
        p1.setAge(221);
        p1.setEmail("123456student.uwm.edu.pl");
        //Poprawne dane
        p1.setName("Jan");
        p1.setAge(24);
        p1.setEmail("654321@student.uwm.edu.pl");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());

    }

    static void zad3(){
        BankAccount ba1 = new BankAccount("Michal", 2000);
        System.out.println(ba1.getOwner());
        System.out.println(ba1.getBalance());
        ba1.deposit(-100); //Nie wykonane warotsc ujemna
        ba1.deposit(300);
        System.out.println(ba1.getBalance());
        ba1.withdraw(3000); //Nie wykonane wartosc przekracza stana na koncie
        ba1.withdraw(400);
        System.out.println(ba1.getBalance());
    }

    static void zad4(){
        int[] points = {50, 20, 30};
        int[] points2 = {140, 230, 340};
        ExamResaults e1 = new ExamResaults(points);

        points[0] = 100;
        System.out.println(Arrays.toString(points));
        System.out.println(Arrays.toString(e1.getPoints()));
        e1.setPoints(points2);
        System.out.println(Arrays.toString(points));
        System.out.println(Arrays.toString(e1.getPoints()));
    }

    static void zad5() {
        Product p1 = new Product("Pralka", 2000);
        Product p2 = new Product("Laptop", 5000);
        System.out.println(Product.getNumberOfProducts());
        Product p3 = new Product("Zmywarka", 2500);
        System.out.println(Product.getNumberOfProducts());
        Product p4 = new Product("myszka",150);
    }

    static void zad6() {
        Product p1 = new Product("Pralka", 2000);
        Product p2 = new Product("Laptop", 5000);
        Product p3 = new Product("Zmywarka", 2500);
        Product p4 = new Product("myszka",150);
        // utworzono p1,p2,p3 natomiast proba utworzenia p4 skonczyla sie wyjatkiem
    }

    static void zad7() {
        StaticCalculator.add(2,2);
        StaticCalculator.subtract(3,3);
        System.out.println("Liczba wykonanych operacji: " + StaticCalculator.getNumberOfOperations());
        StaticCalculator.multiply(4,4);
        System.out.println("Liczba wykonanych operacji: " + StaticCalculator.getNumberOfOperations());

    }

    static void zad8() {
        StaticCalculator.add(2,3);
        StaticCalculator.add(3,4,5);
        StaticCalculator.add(4.5,6.7);
    }

    static void zad9() {
        InitializationDemo i1 = new InitializationDemo(2);
        InitializationDemo i2 = new InitializationDemo(3);
        // Wykonie pola statycznego
        // Wykonie bloku statycznego
        // Wykonanie pola inicjacji
        // Wykonanie bloku inicjacji
        // Wykonanie konstruktora
        // Wykonanie pola inicjacji
        // Wykonanie bloku inicjacji
        // Wykonanie konstruktora
    }

    static void zad10() {

    }

    static void zad11() {
        User u1 = new User("Michal", "ZAQ!2wsx", 22);
        u1.checkPassord("ZAQ!2wsx");
        u1.checkPassord("11111111");
        u1.showUser();
        User u2 = new User("Michal", "ZAQ!2wsx", 1234);
    }

    static void zad12() {
        Student s1 = new Student("Michal", 180586);
        s1.przedstaw();
        s1.przedstaw("Licze na mila wspulprace");
    }
}
