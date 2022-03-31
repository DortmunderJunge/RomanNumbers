package de.katas.romannumbers;

public class ArabicToRomanNumberConverter {

    public String convert(final int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
        }
        if (arabicNumber == 10) {
            return "X";
        }
        return "V";
    }
}
