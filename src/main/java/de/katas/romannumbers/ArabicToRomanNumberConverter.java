package de.katas.romannumbers;

public class ArabicToRomanNumberConverter {

    public String convert(final int arabicNumber) {
        if (arabicNumber > 0 && arabicNumber < 100) {
            return convert(arabicNumber, "");
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
        if (arabicNumber >= 50) {
            return convert(arabicNumber - 50, romanNumber + "L");
        }
        if (arabicNumber >= 40) {
            return convert(arabicNumber + 10, romanNumber + "X");
        }
        if (arabicNumber >= 10) {
            return convert(arabicNumber - 10, romanNumber + "X");
        }
        if (arabicNumber == 9) {
            return convert(arabicNumber + 1, romanNumber + "I");
        }
        if (arabicNumber >= 5) {
            return convert(arabicNumber - 5, romanNumber + "V");
        }
        if (arabicNumber == 4) {
            return convert(arabicNumber + 1, romanNumber + "I");
        }
        return romanNumber + "I".repeat(arabicNumber);
    }
}
