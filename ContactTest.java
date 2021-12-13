/*
 * Travis Garlick
 * 9/November/2021
 * CS230
 * Project 1
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	//testing valid input
	@Test
	void testContact() {
		Contact contact = new Contact("123", "Jon", "Smith", "1235550123", "123 Fake Street");
		assertTrue(contact.getID().equals("123"));
		assertTrue(contact.getFirstName().equals("Jon"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhone().equals("1235550123"));
		assertTrue(contact.getAddress().equals("123 Fake Street"));
	}
	
	//testing invalid input
	//starting with testing inputs that exceed max size
	@Test
	void testContactIDTooLong() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "Jon", "Smith", "1235550123", "123 Fake Street");
		}); }
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", "JonSmith123", "Smith", "1235550123", "123 Fake Street");
		}); }
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jon", "JonSmith123", "1235550123", "123 Fake Street");
		}); }
	
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jon", "Smith", "11235550123", "123 Fake Street");
		}); }
	
	//alternate test for a short phone number
	@Test
	void testContactPhoneTooShort() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jon", "Smith", "5550123", "123 Fake Street");
		}); }
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jon", "Smith", "1235550123", "JonSmith 123 123 Fake Street Nowhere, New Hampshire");
		}); }
	
	//testing null variables
	@Test
	void testContactIDIsNull() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Jon", "Smith", "11235550123", "123 Fake Street");
		}); }
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", null, "Smith", "11235550123", "123 Fake Street");
		}); }
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jon", null, "11235550123", "123 Fake Street");
		}); }
	
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jon", "Smith", null, "123 Fake Street");
		}); }
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertthrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jon", "Smith", "11235550123", null);
		}); }

}
