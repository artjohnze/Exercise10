package Exercise44;

public class Main {
 public static void main(String[] args) {
  MobilePhone mobilePhone = new MobilePhone("123-456-7890");

  Contact contact1 = Contact.createContact("Alice", "111-111-1111");
  Contact contact2 = Contact.createContact("Bob", "222-222-2222");
  Contact contact3 = Contact.createContact("Charlie", "333-333-3333");

  // Add new contacts
  mobilePhone.addNewContact(contact1);
  mobilePhone.addNewContact(contact2);
  mobilePhone.addNewContact(contact3);

  // Print all contacts
  mobilePhone.printContacts();

  // Update a contact
  Contact newContact = Contact.createContact("Alice", "999-999-9999");
  mobilePhone.updateContact(contact1, newContact);

  // Remove a contact
  mobilePhone.removeContact(contact2);

  // Query a contact
  Contact queriedContact = mobilePhone.queryContact("Charlie");
  if (queriedContact != null) {
      System.out.println("Queried: " + queriedContact.getName() + " -> " + queriedContact.getPhoneNumber());
  } else {
      System.out.println("Contact not found.");
  }

  // Print updated contact list
  System.out.println("\nUpdated Contact List:");
  mobilePhone.printContacts();
}
}

