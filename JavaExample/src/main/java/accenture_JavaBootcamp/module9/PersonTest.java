package accenture_JavaBootcamp.module9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        // TODO: Initialize person object
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // TODO: Tear down person object (set to null)
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        // TODO: Test setWeight/getWeight and setHeight/getHeight
        person.setWeight(70);
        assertEquals(70,person.getWeight());

        person.setHeight(172);
        assertEquals(70,person.getWeight());
    }

    @Test
    public void testGetBodyMassIndex() {
        // TODO: Test valid BMI categories (Underweight, Normal weight, Overweight, Obese)
        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)
        assertEquals("Under weight",person.getBodyMassIndex(50.0,1.75));
        assertEquals("Normal weight",person.getBodyMassIndex(70.0,1.75));
        assertEquals("Over weight",person.getBodyMassIndex(85.0,1.75));
        assertEquals("obese",person.getBodyMassIndex(100.0,1.75));

        assertEquals("Normal weight",person.getBodyMassIndex(18.5,1.0));
        assertEquals("Over weight",person.getBodyMassIndex(25.0,1.0));
        assertEquals("obese",person.getBodyMassIndex(30.0,1.0));

        assertEquals("invalid input",person.getBodyMassIndex(0,1.75));
        assertEquals("invalid input",person.getBodyMassIndex(-1,1.75));
        assertEquals("invalid input",person.getBodyMassIndex(700,0));
    }
}