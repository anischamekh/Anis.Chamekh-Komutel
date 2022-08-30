package com.Komutel.ContentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Komutel.ContentManagementSystem.entity.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, String>{

}
