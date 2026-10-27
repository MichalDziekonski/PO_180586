public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }else {
            System.out.println("Nazwa nie moze byc pusta");
        }
        if (age >= 0 && age <= 150) {
            this.age = age;
        }else {
            System.out.println("Wiek powinien byc w zakresie od 0 do 150");
        }
        if (email.contains("@")) {
            this.email = email;
        }else {
            System.out.println("Email powinien zawierac znak @");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }else {
            System.out.println("Nazwa nie moze byc pusta");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {       //Niekoniecznie dobrym pomysłme jest dawanie mozliwosc zmienienia wieku przez urzytkownika
        if (age >= 0 && age <= 150) {
            this.age = age;
        }else {
            System.out.println("Wiek powinien byc w zakresie od 0 do 150");
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }else {
            System.out.println("Email powinien zawierac znak @");
        }
    }
}
