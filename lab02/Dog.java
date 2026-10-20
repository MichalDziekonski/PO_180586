public class Dog {
    String name;
    String bread;
    int age;

    public Dog(String name, String bread, int age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public void bark(){
        System.out.println("wof wof");
    }

    public void showInformation(){
        System.out.println(this.bread + " " + this.name + " wiek: " + this.age + " lat");
    }
}
