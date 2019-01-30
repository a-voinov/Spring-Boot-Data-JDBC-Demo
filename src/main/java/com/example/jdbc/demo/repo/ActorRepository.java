package com.example.jdbc.demo.repo;

import com.example.jdbc.demo.entity.Actor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ActorRepository extends CrudRepository<Actor, Integer> {

    @Query("select count(last_name) from actor where last_name=:lastname")
    int countByLastname(@Param("lastname") String lastname);

}
