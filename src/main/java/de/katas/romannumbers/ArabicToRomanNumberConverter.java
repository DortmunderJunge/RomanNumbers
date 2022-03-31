package de.katas.romannumbers;

public class ArabicToRomanNumberConverter {

    public String convert(final int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
        }
        if (arabicNumber == 2) {
            return "II";
        }
        if (arabicNumber == 3) {
            return "III";
        }
        if (arabicNumber == 5) {
            return "V";
        }
        if (arabicNumber == 10) {
            return "X";
        }
        if (arabicNumber == 50) {
            return "L";
        }
        if (arabicNumber == 100) {
            return "C";
        }
        if (arabicNumber == 500) {
            return "D";
        }
        if (arabicNumber == 1000) {
            return "M";
        }
        throw new IllegalArgumentException(String.format("%d kann ich leider nicht konvertieren :( ", arabicNumber));
    }
}
