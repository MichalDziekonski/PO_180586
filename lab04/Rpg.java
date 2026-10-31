public class Rpg extends Game {
    @Override
    public void start() {
        super.start();
        System.out.println("Metoda start została nadpisana");
    }

    /*
    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Proba nadpisania metody");
    }
    */

    // java: initialize() in Rpg cannot override initialize() in Game
    //  overridden method is final
}
