package utils;

import java.util.Arrays;

public class InputLine {
    Labels mLabel;
    String[] mValues;
    String mFilename;
    int mLineNum;
    String mOrigLine;

    public InputLine(Labels label, String[] values, String filename, int lineNum, String origLine) {
        mLabel = label;
        mValues = values;
        mFilename = filename;
        mLineNum = lineNum;
        mOrigLine = origLine;
    }

    public String toString() {
        return mFilename + " (" + mLineNum + ") " + mLabel + ": " + Arrays.toString(mValues);
    }
}
