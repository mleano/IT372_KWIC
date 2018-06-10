package part1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KWICVersion1 {
    public static void main(String[] args) {
        ArrayList<String> arrayListOfLines = getLinesFromFile("files/americanpielyrics.txt");
        ArrayList<String[]> arrayListOfSplitLines = splitLinesToArrayOfWords(arrayListOfLines);
        ArrayList<String> arrayListOfCircularShiftedLines = circularShiftTheLines(arrayListOfSplitLines);
        ArrayList<String> arrayListOfAlphabetizedCircularShiftedLines =
                alphabetizedTheCircularShiftedLines(arrayListOfCircularShiftedLines);
        printArrayListToConsole(arrayListOfAlphabetizedCircularShiftedLines);
    }

    //This function saves each line from the text file into an array list
    private static ArrayList<String> getLinesFromFile(String filePath) {
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

    //Split each line in each index into an array of its words
    private static ArrayList<String[]> splitLinesToArrayOfWords(ArrayList<String> arrayListOfLines) {
        ArrayList<String[]> arrayListOfSplitLines = new ArrayList<>();

        for (String line: arrayListOfLines) {
            String[] splitLine = line.split(" ");
            arrayListOfSplitLines.add(splitLine);
        }

        return arrayListOfSplitLines;
    }

    //Circular shift. Move first word in each line to the end of the line.
    private static ArrayList<String> circularShiftTheLines(ArrayList<String[]> arrayListOfSplitLines){
        ArrayList<String> arrayListOfCircularShiftedLines = new ArrayList<>();

        for (String[] splitLine: arrayListOfSplitLines) {
            String[] circularShiftedLine = splitLine;

            String placeHolder = circularShiftedLine[0];
            String lastWord = circularShiftedLine[circularShiftedLine.length - 1];

            circularShiftedLine[0] = lastWord;
            circularShiftedLine[circularShiftedLine.length - 1] = placeHolder;

            String joinedLine = String.join(" ", circularShiftedLine);
            arrayListOfCircularShiftedLines.add(joinedLine);
        }

        return arrayListOfCircularShiftedLines;
    }

    //Alphabetize the lines
    private static ArrayList<String> alphabetizedTheCircularShiftedLines(ArrayList<String> circularShiftedLines) {
        ArrayList<String> arrayListOfAlphabetizedCircularShiftedLines = circularShiftedLines;

        Collections.sort(arrayListOfAlphabetizedCircularShiftedLines);

        return arrayListOfAlphabetizedCircularShiftedLines;
    }

    //Print alphabetized circular shifted lines to console
    private static void printArrayListToConsole(ArrayList<String> arrayListOfAlphabetizedCircularShiftedLines) {
        for (String line: arrayListOfAlphabetizedCircularShiftedLines) {
            System.out.println(line);
        }
    }
}
