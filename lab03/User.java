public class User {
    // taby zostały usniete tylko i wylocznie z wzgledu na moja wygode czytania
    private String login;  // zadne z pol nie powinno byc statyczne ani publiczne
    private String password;
    private int age;

    public User(String login, String password, int age) {
        if (age < 0 || age > 150) {
            throw new IllegalStateException("Nie poprawny wiek");
        }
        this.login = login;
        this.password = password;
        this.age = age; // po zmienie pola age na instancyjne powinnismy zamienic User. na this.
    }

    //haslo nie powinno miec metody getPassword mozna ja zamienic na checkPassord

    public void checkPassord(String password) {
        if (this.password == password) {
            System.out.println("Poprawne haslo");
        }else {
            System.out.println("Bledne haslo");
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showUser() { // ta metoda nie powinna byc statyczna blad kompilacji
        System.out.println("Login: " + login +  ", wiek: " + age); // haslo nie powinno byc wyswietlane
    }
}
