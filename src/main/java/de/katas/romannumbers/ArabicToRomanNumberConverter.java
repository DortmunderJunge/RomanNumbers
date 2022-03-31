package de.katas.romannumbers;

public class ArabicToRomanNumberConverter {

    public String convert(final int arabicNumber) {
        if (arabicNumber >= 1 && arabicNumber <= 3) {
            return "I".repeat(arabicNumber);
        }
        if (arabicNumber == 4) {
            return "IV";
        }
        if (arabicNumber >= 5 && arabicNumber <=8) {
            return "V" + "I".repeat(arabicNumber - 5);
        }
        if (arabicNumber == 9) {
            return "IX";
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
