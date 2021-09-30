package com.bridglab.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridglab.addressbook.dto.AddressBookDTO;
import com.bridglab.addressbook.exception.AddressBookException;
import com.bridglab.addressbook.model.AddressBookData;
import com.bridglab.addressbook.reposiratory.AddressBookReposiratory;

@Service
public class AddressBookService implements IAddressBookService {
	
	@Autowired
	private AddressBookReposiratory addressBookRepository;
	
private List<AddressBookData> addressbookList1=new ArrayList<>();

public List<AddressBookData> getAddressBookData() {
	return addressbookList1;
}

public AddressBookData createContact(AddressBookDTO addressbookDTO) {
	AddressBookData addressbookData=null;
	addressbookData=new AddressBookData(addressbookList1.size()+1,addressbookDTO);
	addressbookList1.add(addressbookData);
	return addressbookData;
}

public AddressBookData updatedContact(int contactId, AddressBookDTO addressbookDTO) {
	AddressBookData addressbookData=this.getcontactbyId(contactId);
	addressbookData.setName(addressbookDTO.name);
	addressbookData.setCity(addressbookDTO.city);
	addressbookData.setPhoneNo(addressbookDTO.phoneNo);
	addressbookData.setState(addressbookDTO.state);
	addressbookData.setZip(addressbookDTO.zip);
	addressbookData.setAddress(addressbookDTO.address);
	addressbookList1.set(contactId-1, addressbookData);
	return addressbookData;
}


@Override
public AddressBookData getcontactbyId(int contactId) {
	
	return addressbookList1.stream().filter(empData->empData.getContactId()==contactId)
			.findFirst()
			.orElseThrow(()->new AddressBookException("contact id not found"));

}

@Override
public void deleteAddressBook(int contactId) {
	addressbookList1.remove(contactId-1);
	
}


}
