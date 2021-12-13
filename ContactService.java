/*
 * Travis Garlick
 * 9/November/2021
 * CS230
 * Project 1
 */

package contact;

//importing utility
import java.util.*;

public class ContactService {

	//standard input
	Scanner sc= new Scanner(System.in);
		
	//list to contain contacts
	List<String> contactList = new ArrayList<>();
		
	//adding contacts
	public void addContact() {
		String newID = in.nextLine();
		String newFirstName = in.nextLine();
		String newLastName = in.nextLine();
		String newPhone = in.nextLine();
		String newAddress = in.nextLine();
		Contact newContact = new Contact(newID, newFirstName, newLastName, newPhone, newAddress);
		if (contactList.contains(newContact) == false) {
			contactList.add(newContact);
		}
	}
		
	//deleting a contact
	public void deleteContact() {
		System.out.print("Enter contact ID");
		String checkID = in.nextLine();
		//Finds contact in list
		if (contactList.contains(checkID)){
			//removes contact from list
			contactList.remove(contact that contains checkID);
		}
			
	}
		
	public void updateContact() {
	//updating a contact
		System.out.print("Enter contact ID");
		String checkID = in.nextLine();
		//Finds contact in list
		if (contactList.contains(checkID)){
			//replaces contact in list with new data
			contactList.set(index of checkID, replacementContact);
		}
	}
}
