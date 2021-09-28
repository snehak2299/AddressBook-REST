package com.bridglab.addressbook.dto;

public class AddressBookDTO {
	public String name;
	public String city;
	public String phoneNo;
	
	public AddressBookDTO() {
	}
	
	public AddressBookDTO(String name, String city, String phoneNo) {
		super();
		this.name = name;
		this.city = city;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [name=" + name + ", city=" + city + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
