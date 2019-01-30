package com.example.jdbc.demo.rest;

import com.example.jdbc.demo.entity.Actor;
import com.example.jdbc.demo.repo.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorRepository repository;

    @GetMapping("/get/{id}")
    public String simpleGet(@PathVariable int id){
        Actor actor = repository.findById(id).get();
        return actor.getFirstName() + " " + actor.getLastName();
    }

    @GetMapping("/save")
    public Actor simpleSave(){
        Actor actor = new Actor();
        actor.setFirstName("John");
        actor.setLastName("Doe");
        actor.setLastUpdate(new Date());
        repository.save(actor);
        return actor;
    }

    @GetMapping("/delete/{id}")
    public String simpleDelete(@PathVariable int id){
        repository.deleteById(id);
        return "Actor with id " + id + " has been deleted";
    }

    @GetMapping("/count/{name}")
    public String testCount(@PathVariable String name){
        return "Count by last name " + name + " : " + repository.countByLastname(name);
    }

}
