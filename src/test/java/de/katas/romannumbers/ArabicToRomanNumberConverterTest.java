package de.katas.romannumbers;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
                Arguments.of(1, "I"),
                Arguments.of(5, "V"),
                Arguments.of(10, "X"),
                Arguments.of(50, "L"),
                Arguments.of(100, "C"),
                Arguments.of(500, "D"),
                Arguments.of(1000, "M"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(6, "VI"),
                Arguments.of(7, "VII"),
                Arguments.of(8, "VIII"),
                Arguments.of(9, "IX"),
                Arguments.of(11, "XI"),
                Arguments.of(12, "XII"),
                Arguments.of(13, "XIII"),
                Arguments.of(14, "XIV"),
                Arguments.of(15, "XV"),
                Arguments.of(16, "XVI"),
                Arguments.of(17, "XVII"),
                Arguments.of(18, "XVIII"),
                Arguments.of(19, "XIX"),
                Arguments.of(20, "XX"),
                Arguments.of(40, "XL")
        );
    }

    @Test
    void shouldThrowForUnsupportedNumbers() {
        final int arabicNumber = 0;

        final ThrowableAssert.ThrowingCallable methodUnderTest = () -> sut.convert(arabicNumber);

        assertThatThrownBy(methodUnderTest)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("0 kann ich leider nicht konvertieren");
    }
}
