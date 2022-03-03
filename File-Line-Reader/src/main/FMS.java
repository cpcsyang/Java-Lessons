package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import utils.InputLine;
import utils.Labels;

/**
 * File Management System
 * The file that FMS reads is a space delimited text file.
 * A blank line also indicate the end of data and reading stops.
 */
public class FMS {
    ArrayList<InputLine> mInputLines = new ArrayList<InputLine>();

    public FMS(String filename) {    
        mInputLines = processInputFile(filename);
        if (mInputLines.size() == 0){
            System.out.println("No valid input lines found in \"" + filename + "\"");
            System.exit(10);
        }
    }

    public ArrayList<InputLine> processInputFile(String filename) {
        ArrayList<InputLine> inputLines = new ArrayList<>();
        int lineNum = 0;

        try {
            Scanner input = new Scanner(new File(filename));
            // first read automode params
            while (input.hasNextLine()) {
                // read line from file
                String line = input.nextLine();
                // System.out.println("processing " + line);

                // stop on blank line
                if (line.length() == 0) {
                    break;
                }

                // keep track of line number and original line in case of error
                String origLine = line;
                lineNum++;

                // special case handling of comments
                if (line.startsWith("//")) {
                    inputLines.add(new InputLine(Labels.COMMENT, null, filename, lineNum, origLine));
                    continue;
                }

                // remove spaces and tabs
                line = line.replaceAll("\\s", "");
                line = line.replace("\t", "");

                // seperate label and values on ":"
                String[] labelValues = line.split(":");

                // convert label to enum
                Labels label = Labels.valueOf(labelValues[0].toUpperCase());

                // seperate values on ","
                String[] values = labelValues[1].split(",");

                // remove value labels from values
                for (int i = 0; i < values.length; i++) {
                    values[i] = values[i].split("=")[1];
                }

                inputLines.add(new InputLine(label, values, filename, lineNum, origLine));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem opening " + filename);
            e.printStackTrace();
        }

        return inputLines;
    }
}
