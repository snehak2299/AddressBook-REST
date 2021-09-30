package com.bridglab.addressbook.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.bridglab.addressbook.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name="addressbook_contacts")
public @Data class AddressBookData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	private int contactId;
	
	public String name;
	public String city;
	
	@Column(name="phone_no")
	public String phoneNo;
	public String address;
	public String state;
	public int zip;
	
	@ElementCollection
	@CollectionTable(name="addressbook_type",joinColumns= @JoinColumn(name="id"))
	@Column(name="type")
	private List<String> types;
	
	public AddressBookData(int contactId,AddressBookDTO addressbookdto) {
		super();
		this.contactId = contactId;
		this.name = addressbookdto.name;
		this.city = addressbookdto.city;
		this.phoneNo = addressbookdto.phoneNo;
		this.address =addressbookdto. address;
		this.state = addressbookdto.state;
		this.zip = addressbookdto.zip;
		this.types = addressbookdto.types;
	}
	
	
	

}
