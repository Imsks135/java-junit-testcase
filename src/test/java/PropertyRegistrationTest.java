import static org.junit.Assert.*;

import org.junit.Test;

import com.cgi.assignment.PropertyRegistration;

public class PropertyRegistrationTest {

	@Test
	public void testValidRegistration() {
		PropertyRegistration registration = new PropertyRegistration("house", 1500, "Downtown", 250000.0, "John Doe");
		assertTrue(registration.registerProperty());
	}

	@Test
	public void testInvalidRegistration() {
		// Test with invalid data (e.g., negative area)
		PropertyRegistration registration = new PropertyRegistration("flat", -500, "Suburb", 75000.0, "Jane Smith");
		assertFalse(registration.registerProperty());
	}

}
