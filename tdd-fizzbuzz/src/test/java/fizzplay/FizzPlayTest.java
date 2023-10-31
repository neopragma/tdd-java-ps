package fizzplay;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Unit test cases for the sum() method of class Calc
 * using the JUnit test library - basic implementation.
 */
public class FizzPlayTest {

    private static String[] expected = new String[] {
        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "Fizz", "22", "23", "Fizz", "Buzz", "26", "27", "28", "29", "FizzBuzz",
                "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
                "41", "42", "43", "44", "FizzBuzz", "46", "47", "48", "49", "Buzz",
                "Fizz", "52", "53", "Fizz", "Buzz", "56", "57", "58,", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
                "71", "72", "73", "74", "FizzBuzz", "76", "77", "78", "79", "Buzz",
                "Fizz", "82", "83", "84", "Buzz", "86", "87", "88", "89", "Buzz",
                "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"
    };

    @ParameterizedTest
    @MethodSource("provideClassN")

    public void checkFizzBuzz() {
        assertArrayEquals(expected, actual);

    }
}

