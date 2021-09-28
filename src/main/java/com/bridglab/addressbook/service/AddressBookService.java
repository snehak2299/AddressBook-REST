package com.bridglab.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridglab.addressbook.dto.AddressBookDTO;
import com.bridglab.addressbook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {
private List<AddressBookData> addressbookList=new ArrayList<>();
	
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> addressbookList=new ArrayList<>();
		addressbookList.add(new AddressBookData(1,new AddressBookDTO("sneha","kalyan","9892789234")));
		return addressbookList;
	}

	public AddressBookData getcontactbyId(int contactId) {
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(2,new AddressBookDTO("Pankaj","kalyan","9892735509"));
		return addressbookData;
	}

	public AddressBookData createContact(AddressBookDTO addressbookDTO) {
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(1,addressbookDTO);
		return addressbookData;
	}

	public AddressBookData updatedContact(int contactId, AddressBookDTO addressbookDTO) {
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(contactId,addressbookDTO);
		return addressbookData;
	}

	public void deleteAddressBook(int contactId) {
		
	}
}
