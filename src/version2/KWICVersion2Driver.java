package version2;

import java.util.ArrayList;

public class KWICVersion2Driver {
    public static void main(String[] args) {
        LineManager lineManager = new LineManager();
        LineIO lineIO = new LineIO();

        ArrayList<String> arrayListOfLines = lineIO.getLinesFromFile("files/yoursonglyrics.txt");
        ArrayList<String[]> arrayListOfSplitLines = lineManager.splitLinesToArrayOfWords(arrayListOfLines);
        ArrayList<String> arrayListOfCircularShiftedLines = lineManager.circularShiftTheLines(arrayListOfSplitLines);
        ArrayList<String> arrayListOfAlphabetizedCircularShiftedLines =
                lineManager.alphabetizedTheCircularShiftedLines(arrayListOfCircularShiftedLines);
        lineManager.printArrayListToConsole(arrayListOfAlphabetizedCircularShiftedLines);
    }
}
