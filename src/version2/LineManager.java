package version2;

import java.util.ArrayList;
import java.util.Collections;

public class LineManager {
    //Split each line in each index into an array of its words
    public ArrayList<String[]> splitLinesToArrayOfWords(ArrayList<String> arrayListOfLines) {
        ArrayList<String[]> arrayListOfSplitLines = new ArrayList<>();

        for (String line: arrayListOfLines) {
            String[] splitLine = line.split(" ");
            arrayListOfSplitLines.add(splitLine);
        }

        return arrayListOfSplitLines;
    }

    //Circular shift. Move first word in each line to the end of the line.
    public ArrayList<String> circularShiftTheLines(ArrayList<String[]> arrayListOfSplitLines){
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
    public ArrayList<String> alphabetizedTheCircularShiftedLines(ArrayList<String> circularShiftedLines) {
        ArrayList<String> arrayListOfAlphabetizedCircularShiftedLines = circularShiftedLines;

        Collections.sort(arrayListOfAlphabetizedCircularShiftedLines);

        return arrayListOfAlphabetizedCircularShiftedLines;
    }

    //Print alphabetized circular shifted lines to console
    public void printArrayListToConsole(ArrayList<String> arrayListOfAlphabetizedCircularShiftedLines) {
        for (String line: arrayListOfAlphabetizedCircularShiftedLines) {
            System.out.println(line);
        }
    }
}
