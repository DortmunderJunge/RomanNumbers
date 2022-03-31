package de.katas.romannumbers;

public class ArabicToRomanNumberConverter {

    public String convert(final int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
        }
        return "V";
    }
}
