package com.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PermutationsTest {

    // Use below link for a guide to print testing.
    // https://www.baeldung.com/java-testing-system-out-println

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testPrintPermutations() {

        Permutations.printPermutations("car");

        // .trim() accounts for the newline that System.out.println does.
        Assertions.assertEquals("[car, cra, acr, arc, rca, rac]",
                outputStreamCaptor.toString().trim());

    }

    @Test
    void testPrintPermutationsUnique() {

        Permutations.printPermutationsUnique("car");

        // .trim() accounts for the newline that System.out.println does.
        Assertions.assertEquals("[acr, rca, cra, arc, car, rac]",
                outputStreamCaptor.toString().trim());

    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
