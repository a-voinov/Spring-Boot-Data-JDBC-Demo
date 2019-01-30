package com.example.jdbc.demo.rest;

import com.example.jdbc.demo.entity.Country;
import com.example.jdbc.demo.repo.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryRepository repository;

    @GetMapping("/get/{id}")
    public Country getCountry(@PathVariable int id){
        return repository.findById(id).get();
    }
}
