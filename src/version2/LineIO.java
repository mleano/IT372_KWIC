package version2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LineIO {
    public ArrayList<String> getLinesFromFile(String filePath) {
        ArrayList<String> textFileLinesList = new ArrayList<>();

        try (Scanner reader = new Scanner(new FileInputStream(filePath))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                line = line.toLowerCase();
                textFileLinesList.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Read error: " + ex.getMessage());
        }

        return textFileLinesList;
    }
}
