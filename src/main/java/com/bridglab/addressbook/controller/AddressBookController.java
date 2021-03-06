package com.bridglab.addressbook.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridglab.addressbook.dto.AddressBookDTO;
import com.bridglab.addressbook.dto.ResponseDTO;
import com.bridglab.addressbook.model.AddressBookData;
import com.bridglab.addressbook.service.IAddressBookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/addressbook")
@Slf4j
public class AddressBookController {
	@Autowired
	private IAddressBookService AddressBookService;

	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO>  getaddressbookData(){
		List<AddressBookData> addressbookData=null;
		addressbookData=AddressBookService.getAddressBookData();
		ResponseDTO respDTO=new ResponseDTO("Get call Success",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("contactId") int contactId){
		AddressBookData addressbookData=AddressBookService.getcontactbyId(contactId);
		ResponseDTO respDTO=new ResponseDTO("Get call Success",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddresssBookData(@Valid @RequestBody AddressBookDTO addressbookDTO)
	{
		log.debug("Employee DTO: "+addressbookDTO.toString());
		AddressBookData addressbookData=AddressBookService.createContact(addressbookDTO);
		ResponseDTO respDTO=new ResponseDTO("Created Contact in address book Sucessfully ",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/type/{type}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("types") String types)
	{
		List<AddressBookData> contactList=null;
		contactList=AddressBookService.getContactByType(types);
		ResponseDTO respDTO=new ResponseDTO("Get call for ID SucessFul",contactList);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{contactId}") 
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("contactId") int contactId,@Valid @RequestBody AddressBookDTO addressbookDTO){
		AddressBookData addressbookData=AddressBookService.updatedContact(contactId, addressbookDTO);
		ResponseDTO respDTO=new ResponseDTO("Updates address book Sucessfully",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);

		
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("contactId") int contactId){
		AddressBookService.deleteAddressBook(contactId);
		ResponseDTO respDTO=new ResponseDTO("Deleted contact Sucessfully","Deleted Id: "+contactId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
