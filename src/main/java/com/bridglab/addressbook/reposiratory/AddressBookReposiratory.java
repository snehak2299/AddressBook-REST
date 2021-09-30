package com.bridglab.addressbook.reposiratory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridglab.addressbook.model.AddressBookData;

public interface AddressBookReposiratory extends JpaRepository <AddressBookData ,Integer>{

}
