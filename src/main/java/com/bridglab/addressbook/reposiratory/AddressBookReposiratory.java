package com.bridglab.addressbook.reposiratory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridglab.addressbook.model.AddressBookData;

public interface AddressBookReposiratory extends JpaRepository <AddressBookData ,Integer>{
	@Query(value="select * from addressbook_contacts,addressbook_types where contact_id=id and types= :types",nativeQuery=true)
	List<AddressBookData> findcontactByType(String type);
}
