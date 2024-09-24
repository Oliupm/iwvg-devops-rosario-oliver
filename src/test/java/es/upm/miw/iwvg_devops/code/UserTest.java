package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;
    private final List<Fraction> fractions = new ArrayList<>();

    @BeforeEach
    void before() {
        fractions.add(new Fraction(1,2));
        fractions.add(new Fraction(3,2));
        user = new User("2", "oli", "ros", fractions);
    }

    @Test
    void testUserIntInt() {
        assertEquals("2", this.user.getId());
        assertEquals("oli", this.user.getName());
        assertEquals("ros", this.user.getFamilyName());
        assertEquals(fractions, this.user.getFractions());
    }

    @Test
    void testUser() {
        user = new User();
        assertEquals(0, user.getFractions().size());
    }

    @Test
    void testFullName() {
        assertEquals("oli ros", this.user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("o.", this.user.initials());
    }

    @Test
    void testSetName() {
        String newName = "ver";
        user.setName(newName);
        assertEquals("ver", this.user.getName());
    }

    @Test
    void testSetFamilyName() {
        String newFamilyName = "ario";
        user.setFamilyName(newFamilyName);
        assertEquals("ario", this.user.getFamilyName());
    }

    @Test
    void testSetFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(3,5));
        newFractions.add(new Fraction(4,8));
        newFractions.add(new Fraction(6,4));
        this.user.setFractions(newFractions);
        assertEquals(3, this.user.getFractions().size());
    }

    @Test
    void testAddFractions() {
        this.user.addFraction(new Fraction(1,8));
        this.user.addFraction(new Fraction(5,3));
        assertEquals(4, this.user.getFractions().size());
    }
}
