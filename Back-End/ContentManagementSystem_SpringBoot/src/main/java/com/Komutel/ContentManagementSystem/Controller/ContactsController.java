package com.Komutel.ContentManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Komutel.ContentManagementSystem.entity.Contacts;
import com.Komutel.ContentManagementSystem.Repository.ContactsRepository;

@RestController
public class ContactsController {
	
	@Autowired
	private ContactsRepository contactsRepository;
	
	@PostMapping(path="/contact")
	public Contacts addContact(@RequestBody Contacts contact) {
		return contactsRepository.save(contact);
	}

}
