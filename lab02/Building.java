public class Building {
    String name;
    String ulica;
    String nrBudynku;

    public Building(String ulica, String nrBudynku, String name) {
        this.ulica = ulica;
        this.nrBudynku = nrBudynku;
        this.name = name;
    }

    public void info(){
        System.out.println("Buynek " + name + " na ulicy " + ulica + " " + nrBudynku);
    }
}
