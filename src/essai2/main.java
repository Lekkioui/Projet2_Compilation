package essai2;
import java.io.*;
import java.nio.file.*;

import java.io.FileInputStream;
public class main {
    public static void main(String[] args) {
        // Chemin du fichier
        String file = "C:\\\\\\\\Users\\\\\\\\MOI\\\\\\\\Desktop\\\\\\\\instructions.txt.txt";

        try {
            if (!file.isEmpty()) {  // Vérifie si le chemin n'est pas vide
                // Lire le fichier
                Projet1Parser parser = new Projet1Parser(new FileInputStream(file));
                parser.Program();
            } else {
                // Example en dur si pas de fichier
                String programme = "X := 350;\n" +
                                 "Y := X * 3 - 25 / 5;\n" +
                                 "afficher(Y + 5);";
                Projet1Parser parser = new Projet1Parser(new StringReader(programme));
                parser.Program();
            }
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}