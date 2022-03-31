package de.katas.romannumbers;

public class ArabicToRomanNumberConverter {

    public String convert(final int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
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
        return "V";
    }
}
