package part1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KWICPart1 {
    public static void main(String[] args) {
        ArrayList<String> arrayListOfLines = getLinesFromFile("files/warAndPeace.txt");
        splitLinesToArrayOfWords(arrayListOfLines);


    }

    //This function saves each line from the text file into an array list
    private static ArrayList<String> getLinesFromFile(String filePath) {
        ArrayList<String> textFileLinesList = new ArrayList<>();

        try (Scanner reader = new Scanner(new FileInputStream(filePath))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                textFileLinesList.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Read error: " + ex.getMessage());
        }

        return textFileLinesList;
    }

    private static ArrayList<String[]> splitLinesToArrayOfWords(ArrayList<String> arrayListOfLines) {
        ArrayList<String[]> arrayListOfSplitLines = new ArrayList<>();

        for (String line: arrayListOfLines) {
            String[] splitLine = line.split(" ");
//            arrayListOfLines.add(splitLine);

            System.out.println(splitLine[splitLine.length-1].toString());//todo delete
        }

        return null;
    }



}
