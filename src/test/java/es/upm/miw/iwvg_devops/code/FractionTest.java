package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(3,4);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() { assertEquals(0.75, this.fraction.decimal()); }

    @Test
    void testSetNumerator() {
        int newNumerator = 7;
        fraction.setNumerator(newNumerator);
        assertEquals(7, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        int newDenominator = 9;
        fraction.setDenominator(newDenominator);
        assertEquals(9, fraction.getDenominator());
    }

    @Test
    void testIsProper() { assertTrue(new Fraction(3,5).isProper()); }

    @Test
    void testIsImproper() { assertTrue(new Fraction(8,4).isImproper()); }

    @Test
    void testIsEquivalent() {
        Fraction equivalent = new Fraction(12,16);
        assertTrue(this.fraction.isEquivalent(equivalent));
    }

    @Test
    void testAdd() {
        Fraction addedFraction = new Fraction(7,4);
        Fraction comparator = new Fraction(40,16);
        Fraction solution = this.fraction.add(addedFraction);
        assertEquals(solution.getNumerator(), comparator.getNumerator());
        assertEquals(solution.getDenominator(), comparator.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction multiplier = new Fraction(3,5);
        Fraction comparator = new Fraction(9,20);
        Fraction solution = this.fraction.multiply(multiplier);

        assertEquals(solution.getNumerator(), comparator.getNumerator());
        assertEquals(solution.getDenominator(), comparator.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction divisor = new Fraction(3,5);
        Fraction comparator = new Fraction(15,12);
        Fraction solution = this.fraction.divide(divisor);

        assertEquals(solution.getNumerator(), comparator.getNumerator());
        assertEquals(solution.getDenominator(), comparator.getDenominator());
    }

}
