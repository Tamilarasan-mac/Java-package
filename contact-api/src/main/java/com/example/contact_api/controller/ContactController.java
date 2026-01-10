package com.example.contact_api.controller;

import com.example.contact_api.model.Contact;
import com.example.contact_api.servicelayer.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public Contact create(@RequestBody Contact contact) {
        return service.save(contact);
    }

    @GetMapping
    public List<Contact> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Contact getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}