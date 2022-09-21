package org.lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTest {
    @Test
    void checkIntegerAdditionTest() {
        int number1 = 20;
        int number2 = 30;
        assertEquals(50, Main.add(number1, number2));
    }

    @Test
    void checkZeroAdditionTest() {
        int number = 0;
        assertEquals(0, number + number);
    }
}
