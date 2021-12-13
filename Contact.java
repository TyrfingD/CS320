/*
 * Travis Garlick
 * 9/November/2021
 * CS230
 * Project 1
 */

package contact;

public class Task {
	
	//Contact class defines contact info
	private String ID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//exceptions define valid field parameter lengths
	public Contact(String ID, String firstName, String lastName, String phone, String address) {
		if(ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	//getters for all five variables
	public String getID(){
		return ID;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public String getAddress(){
		return address;
	}
}
