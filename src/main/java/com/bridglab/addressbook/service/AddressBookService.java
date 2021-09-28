package com.bridglab.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridglab.addressbook.dto.AddressBookDTO;
import com.bridglab.addressbook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {
private List<AddressBookData> addressbookList1=new ArrayList<>();

public List<AddressBookData> getAddressBookData() {
	return addressbookList1;
}

public AddressBookData createContact(AddressBookDTO addressbookDTO) {
	AddressBookData addressbookData=null;
	addressbookData=new AddressBookData(1,addressbookDTO);
	addressbookList1.add(addressbookData);
	return addressbookData;
}

public AddressBookData updatedContact(int contactId, AddressBookDTO addressbookDTO) {
	AddressBookData addressbookData=this.getcontactbyId(contactId);
	addressbookData.setName(addressbookDTO.name);
	addressbookData.setCity(addressbookDTO.city);
	addressbookData.setPhoneNo(addressbookDTO.phoneNo);
	addressbookList1.set(contactId-1, addressbookData);
	return addressbookData;
}


@Override
public AddressBookData getcontactbyId(int contactId) {
	return addressbookList1.get(contactId-1);

}

@Override
public void deleteAddressBook(int contactId) {
	addressbookList1.remove(contactId-1);
	
}


}
