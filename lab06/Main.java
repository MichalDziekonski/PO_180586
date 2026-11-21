public class Main {
    static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        //zad5();
        //zad6();
        //zad7();
        //zad8();
        //zad9();
        //zad11();
        //zad12();
        //zad13();
        zad14();
    }

    static void zad1() {
        Shape[] shapes = {
                new Circle("Kolo", 2),
                new Rectangle("Protokont",4, 3),
                new Triangle("Trujkat", 3, 4)
        };

        for (Shape shape : shapes) {
            shape.printInformation();
        }
    }

    static void zad2() {
        Shape s1 = new Circle("Kolo", 3);
        // w pierwszej kolejność wykonuje się konstruktor Shape dopiero potem konstruktor Circle
    }

    static void zad3() {
        Employee[] employee = {
                new Manager("Jan", 800),
                new Developer("Adam", 900),
                new Salesperson("Kamil", 1000)
        };

        for (Employee employes : employee) {
            employes.printPayslip();
        }
    }

    static void zad4() {
        Printable[] elements = {
                new Ticket(123432),
                new Invoice(213456),
                new Report("Raport kwartalny")
        };

        for (Printable printable : elements) {
            printable.print();
        }
    }

    static void zad5() {
        Printable printable = new Report("Raport kwartalny");
        Exportable exportable = new Report("Raport roczny");
        Savable savable = new Report("Raport semestralny");

        printable.print();
        exportable.export();
        savable.save();

        // Wszystkie zmienne mają metody zalerzne przypisane do interfejsów na których są implementowane
    }

    static void zad6() {
        Printable p1 = new Report("Raport kwartalny");
        Printable p2 = new Invoice(124356);

        p1.printHeader();
        p2.printHeader();
    }

    static void zad7() {
        C c = new C();
        c.hello();

        //java: types A and B are incompatible;
        //  class C inherits unrelated defaults for hello() from types A and B
    }

    static void zad8() {
        ReadWrite o1 = new TextDocument();

        o1.read();
        o1.write();
    }

    static void zad9() {
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        eagle.eat();
        eagle.fly();
        sparrow.eat();
        sparrow.fly();
        penguin.eat();
        // nielot
    }

    static void zad10() {
        /*
        Car HAS-A Engine kompozycja/agregacja
        Dog IS-A Animal dziedziczenie
        House HAS-A Address kompozycja/agregacja
        Manager IS-A Employee dziedziczenie
        Computer HAS-A Processor kompozycja/agregacja
        Student HAS-A University asocjacja
        Book HAS-A Author kompozycja/agregacja
        Order USES-A PaymentMethod kompozycja/agregacja
         */
    }

    static void zad11() {
        Car o1 = new Car(new Engine("1.9 TDI"), new Gearbox());
        o1.start();
    }

    static void zad12() {
        OrderService o1 = new OrderService(new CardPayment());
        o1.checkout(1200);
        OrderService o2 = new OrderService(new BlikPayment());
        o2.checkout(1220);
        OrderService o3 = new OrderService(new TransferPayment());
        o3.checkout(1222);
    }

    static void zad13() {
        // nie jest to IS-A tylko HAS-A
        Database o1 = new Database();
        //ReportService o2 = new ReportService(o1);
        //o2.generateReport();
    }

    static void zad14() {
        ReportService o1 = new ReportService(new DatabaseStorage());
        o1.generateReport();
        ReportService o2 = new ReportService(new FileStorage());
        o2.generateReport();
        ReportService o3 = new ReportService(new ConsoleStorage());
        o3.generateReport();
    }

    static void zad15() {
        /*
        Shape abstrakcyjna Tak Tak Nie Tak
        Printable interfejs Nie Nie Tak Nie
        Employee abstrakcyjna Tak Tak Nie Tak
        Comparable interfejs Nie Nie Tak Nie
        Vehicle abstrakcyjna Tak Tak Nie Tak
        Encryptable interfejs Nie Nie Tak Nie
        NotificationSender interfejs Nie Nie Tak Nie
        Account abstrakcyjna Tak Tak Nie Tak
         */
    }
}
