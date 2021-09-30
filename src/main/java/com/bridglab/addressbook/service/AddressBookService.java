package com.bridglab.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridglab.addressbook.dto.AddressBookDTO;
import com.bridglab.addressbook.exception.AddressBookException;
import com.bridglab.addressbook.model.AddressBookData;
import com.bridglab.addressbook.reposiratory.AddressBookReposiratory;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {
	
	@Autowired
	private AddressBookReposiratory addressBookRepository;
	
private List<AddressBookData> addressbookList1=new ArrayList<>();

public List<AddressBookData> getAddressBookData() {
	return addressBookRepository.findAll();
}

public AddressBookData createContact(AddressBookDTO addressbookDTO) {
	AddressBookData addressbookData=null;
	addressbookData=new AddressBookData(addressbookDTO);
	
	log.debug("AddressBook Data"+addressbookData.toString());
	return addressBookRepository.save(addressbookData);
}

public AddressBookData updatedContact(int contactId, AddressBookDTO addressbookDTO) {
	AddressBookData addressbookData=this.getcontactbyId(contactId);
	addressbookData.updateAddressBookData(addressbookDTO);
	return  addressBookRepository.save(addressbookData);
}


@Override
public AddressBookData getcontactbyId(int contactId) {
	
	return addressBookRepository
			.findById(contactId)
			.orElseThrow(()->new AddressBookException("AddressBook not found"));

}

@Override
public void deleteAddressBook(int contactId) {
	addressbookList1.remove(contactId-1);
	
}


}
