public interface Writable {

    default void write() {
        System.out.println("Edycja pliku");
    }
}
