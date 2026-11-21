public interface Readable {

    default void read() {
        System.out.println("Odczyt pliku");
    }
}
