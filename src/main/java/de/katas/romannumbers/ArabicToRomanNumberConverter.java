package de.katas.romannumbers;

public class ArabicToRomanNumberConverter {

    public String convert(final int arabicNumber) {
        if (arabicNumber > 0 && arabicNumber < 9 && arabicNumber != 4) {
            return convert(arabicNumber, "");
        }
        if (arabicNumber == 4) {
            return "IV";
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

    private String convert(final int arabicNumber, final String romanNumber) {
        if (arabicNumber >= 5 && arabicNumber < 9) {
            return convert(arabicNumber - 5, "V");
        }
        return romanNumber + "I".repeat(arabicNumber);
    }
}
