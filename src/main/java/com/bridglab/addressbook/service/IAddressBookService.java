package com.bridglab.addressbook.service;

import java.util.List;

import com.bridglab.addressbook.dto.AddressBookDTO;
import com.bridglab.addressbook.model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressBookData();
	AddressBookData getcontactbyId(int contactId);
	AddressBookData createContact(AddressBookDTO addressbookDTO);
	AddressBookData updatedContact(int contactId, AddressBookDTO addressbookDTO);
	void deleteAddressBook(int contactId);
	List<AddressBookData> getContactByType(String types);
}
