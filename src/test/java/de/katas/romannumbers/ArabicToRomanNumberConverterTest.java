package de.katas.romannumbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArabicToRomanNumberConverterTest {

    private ArabicToRomanNumberConverter sut = new ArabicToRomanNumberConverter();

    @Test
    void shouldConvert1ToI() {
        final int input = 1;

        final String romanNumber = sut.convert(input);

        assertThat(romanNumber).isEqualTo("I");
    }

    @Test
    void shouldConvert5ToV() {
        final int input = 5;

        final String romanNumber = sut.convert(input);

        assertThat(romanNumber).isEqualTo("V");
    }

    @Test
    void shouldConvert10ToX() {
        final int input = 10;

        final String romanNumber = sut.convert(input);

        assertThat(romanNumber).isEqualTo("X");
    }
}
