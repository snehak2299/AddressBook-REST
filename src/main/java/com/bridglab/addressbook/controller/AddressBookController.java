package com.bridglab.addressbook.controller;


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

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO>  getaddressbookData(){
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(1,new AddressBookDTO("sneha","dombivli","9892789023"));
		ResponseDTO respDTO=new ResponseDTO("Get call Success",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("contactId") int contactId){
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(1,new AddressBookDTO("Pankaj","kalyan", "12356789032"));
		ResponseDTO respDTO=new ResponseDTO("Get call Success",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddresssBookData(@RequestBody AddressBookDTO addressbookDTO)
	{
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(3,addressbookDTO);
		ResponseDTO respDTO=new ResponseDTO("Created address book entry Sucessfully ",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{contactId}") 
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("contactId") int contactId,@RequestBody AddressBookDTO addressbookDTO){
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(contactId,addressbookDTO);
		ResponseDTO respDTO=new ResponseDTO("Updates address book Data Sucessfully",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);

		
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("contactId") int contactId){
		ResponseDTO respDTO=new ResponseDTO("Deleted Sucessfully","Deleted Id: "+contactId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
