public class Main {
    public static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        //zad5();
        //zad6();
        //zad7();
        //zad8();
        //zad9();
        //zad10();
        //zad11();
        zad12();
    }

    static void zad1(){
        System.out.println("Zad 1");
        Dog pies1 = new Dog("Rex", "Owczarek niemiecki", 5);
        Dog pies2 = new Dog("Lady", "Rodwailer", 3);

        pies2.bark();

        pies1.showInformation();
        pies2.showInformation();
    }

    static void zad2(){
        System.out.println("Zad 2"); // to poprawic
        Point point1 = new Point(2,4);
        Point point2 = new Point(3,9);

        System.out.println(point1.distance(point2));
    }

    static void zad3(){
        System.out.println("Zad 3");
        Book book1 = new Book("abc", "Jan Kowalski", 2026);
        Book book2 = new Book("def", "Karol Nowak");

        System.out.println(book1.author + " " + book1.title + " " + book1.punlicationYear);
        System.out.println(book2.author + " " + book2.title + " " + book2.punlicationYear);
    }

    static void zad4(){
        System.out.println("Zad 4");
        Car auto1 = new Car("Audi", "a3", 2005, 200000);

        auto1.showInformation();
        auto1.distance(2000.1);
        auto1.showInformation();
    }

    static void zad5(){
        System.out.println("Zad 5");
        Car orginal = new Car("Audi", "a3", 2005, 200000);
        Car copy = new Car(orginal);

        orginal.productioYear = 2006;

        orginal.showInformation();
        copy.showInformation(); // obiekt copy jedynie przekopiowal wartosc przy stworzeniu nie wskazuje do tego samego miejsca w pamieci
    }

    static void zad6(){
        System.out.println("Zad 6");
        Person first = new Person("Michal");
        Person second = first;

        second.Name = "Mateusz";
        first.introduceYourself(); // obydwa obiekty wskazuja na te same miejsce w pamieci
        second.introduceYourself();
    }

    static void zad7(){
        Person first = new Person("Michal");
        Person secondCp = first;
        Person secondNew = new Person(first.Name);

        System.out.println("first: " + first.Name + " secondCp: " + secondCp.Name + " secondNew " + secondNew.Name);
        secondCp.Name = "Jacek";
        System.out.println("Po zmianie secondCp first: " + first.Name + " secondCp: " + secondCp.Name);
        secondNew.Name = "Mateusz";
        System.out.println("Po zmianie secondNew first: " + first.Name + " secondNew: " + secondNew.Name);
        //Składnia bez new zapisuje miejsce w pamięci w ktoremy znajduje się first.Name natomiast składnia z new tworzy nowy oddielny zapis w pamięci
    }

    static void zad8(){
        Counter c1 = new Counter(1);
        Counter c2 = new Counter(2);

        c1.increaseOther(c2);

        System.out.println(c1.value);
        System.out.println(c2.value);
    }

    static void zad9(){
        Car car = null;
        car.showInformation();
        // Odpalenie skotkuje wyrzucenie NullPointerException poniewaz wartosc car jest null
    }

    static void zad10(){
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);

        System.out.println(a == b);
        System.out.println(a == c);
        // wyniki to 20,20,30,true,false
    }

    static void zad11(){
        Product product = new Product("Monitor", 1200);

        product.show();
    }

    static void zad12(){
        Building b1 = new Building("Wyimaginowana", "123A", "UI");
        b1.info();
        Student s1 = new Student("Michal", "Dziekonski", 180586);
        s1.introduce();
        Wykladowca w1 = new Wykladowca("Jan", "Kowalski", "Programowanie");
        w1.announcement();
    }
}
