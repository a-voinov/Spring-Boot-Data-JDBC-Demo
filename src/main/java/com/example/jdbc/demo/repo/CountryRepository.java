package com.example.jdbc.demo.repo;

import com.example.jdbc.demo.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
