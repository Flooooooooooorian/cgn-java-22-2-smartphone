package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void calculatePosition_returnsKoeln() {
        // GIVEN
        Smartphone smartphone = generateDummySmartphone();
        String expected = "Köln";

        // WHEN / THEN
        String actual = smartphone.calculatePosition();
        assertEquals(expected, actual);
    }

    @Test
    void startRadio_returnsTrue() {
        // GIVEN
        Smartphone smartphone = generateDummySmartphone();

        // WHEN / THEN
        assertTrue(smartphone.startRadio());
    }

    @Test
    void stopRadio_returnsFalse() {
        // GIVEN
        Smartphone smartphone = generateDummySmartphone();

        // WHEN / THEN
        assertFalse(smartphone.stopRadio());
    }

    @Test
    void testToString() {
        // GIVEN
        Smartphone smartphone = generateDummySmartphone();
        String expected = "Smartphone{model='S11', brand='Samsung', contacts=[Friend{name='Anton', telephoneNumber='+4917123465'}]}";

        // WHEN / THEN
        String actual = smartphone.toString();
        assertEquals(expected, actual);
    }

    private Smartphone generateDummySmartphone() {
        Contact[] contacts = {new Friend("Anton", "+4917123465")};
        Smartphone smartphone = new Smartphone("S11", "Samsung", contacts);
        return smartphone;
    }
}