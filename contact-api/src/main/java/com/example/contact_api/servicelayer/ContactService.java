package com.example.contact_api.servicelayer;

import com.example.contact_api.model.Contact;
import com.example.contact_api.repository.ContactRepository;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ContactService {

    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public Contact save(Contact contact) {
        return repo.save(contact);
    }

    public List<Contact> findAll() {
        return repo.findAll();
    }

    public Contact findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}