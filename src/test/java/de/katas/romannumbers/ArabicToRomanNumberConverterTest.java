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
}
