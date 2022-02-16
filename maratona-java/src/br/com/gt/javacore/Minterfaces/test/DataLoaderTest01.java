package br.com.gt.javacore.Minterfaces.test;

import br.com.gt.javacore.Minterfaces.dominio.DataLoader;
import br.com.gt.javacore.Minterfaces.dominio.DatabaseLoader;
import br.com.gt.javacore.Minterfaces.dominio.FileLoader;

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
