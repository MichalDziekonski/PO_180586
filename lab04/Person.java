public abstract class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void showInformation() {
        System.out.println(
                "Person: " + this.name
        );
    }

    public abstract void showInformations();
}
