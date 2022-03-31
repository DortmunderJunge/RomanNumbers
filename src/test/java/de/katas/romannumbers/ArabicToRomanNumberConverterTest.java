package de.katas.romannumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ArabicToRomanNumberConverterTest {

    private ArabicToRomanNumberConverter sut;

    @BeforeEach
    void setUp() {
        sut = new ArabicToRomanNumberConverter();
    }

    @ParameterizedTest(name="{index} - should convert {0} to {1}")
    @MethodSource("provideNumbers")
    void shouldConvertArabicNumberToRomanNumber(final int arabicNumber, final String expectedRomanNumber) {
        final String romanNumber = sut.convert(arabicNumber);

        assertThat(romanNumber).isEqualTo(expectedRomanNumber);
    }

    static Stream<Arguments> provideNumbers() {
        return Stream.of(
                Arguments.arguments(1, "I"),
                Arguments.arguments(5, "V"),
                Arguments.arguments(10, "X"),
                Arguments.arguments(50, "L"),
                Arguments.arguments(100, "C"),
                Arguments.arguments(500, "D"),
                Arguments.arguments(1000, "M")
        );
    }
}
