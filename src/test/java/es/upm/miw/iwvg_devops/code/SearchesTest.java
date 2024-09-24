package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    void testFindHighestFraction() {
        Fraction searched = new Searches().findHighestFraction();
        Fraction highest = new Fraction(1,0);
        assertEquals(highest.getNumerator(), searched.getNumerator());
        assertEquals(highest.getDenominator(), searched.getDenominator());
    }
}
