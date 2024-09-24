package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindHighestFraction() {
        Fraction searched = new Searches().findHighestFraction();
        Fraction highest = new Fraction(0,0);
        assertEquals(highest.getNumerator(), searched.getNumerator());
        assertEquals(highest.getDenominator(), searched.getDenominator());
    }

    @Test
    void testFindUserIdByAnyProperFraction() {
        assertEquals(List.of("1", "2", "3", "5"), new Searches().findUserIdByAnyProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserNameByAnyImproperFraction() {
        assertEquals(List.of("Oscar", "Ana", "Oscar", "Antonio", "Paula"), new Searches().findUserNameByAnyImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameByImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Blanco", "Torres"), new Searches().findUserFamilyNameByImproperFraction()
                .collect(Collectors.toList()));
    }
}
