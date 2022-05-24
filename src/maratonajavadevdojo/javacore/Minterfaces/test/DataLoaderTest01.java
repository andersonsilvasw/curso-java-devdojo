package maratonajavadevdojo.javacore.Minterfaces.test;

import maratonajavadevdojo.javacore.Minterfaces.dominio.DataLoader;
import maratonajavadevdojo.javacore.Minterfaces.dominio.DatabaseLoader;
import maratonajavadevdojo.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
