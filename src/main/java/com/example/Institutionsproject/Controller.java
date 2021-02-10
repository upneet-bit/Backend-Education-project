package com.example.Institutionsproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {
    @Autowired
    InstitutionsRepository repository;


    @GetMapping("/")
    public String baseRoute(){
        return "hello";
    }

    @GetMapping("/institutes")
    public List<Institutions> getAllInstitutes(){
    return repository.findAll();
    }

//    @GetMapping("/institute/{name}")
//    public List<Institutions> findByName(@PathVariable String name){ return (List<Institutions>) repository.findByName(name);}

    @PostMapping("/institutes")
    Institutions institute(@RequestBody Institutions institute){
        return repository.save(institute);
    }

    @PutMapping("/institutes/{id}")
    public Institutions update(@PathVariable String id, @RequestBody Map<String, String> body){
        int instituteId = Integer.parseInt(id);
        // getting institute
        Institutions institutes = repository.getOne(instituteId);
        institutes.setName(body.get("name"));
        institutes.setExcerpt(body.get("excerpt"));
        institutes.setEmail(body.get("email"));
        institutes.setLocation(body.get("location"));
        return repository.save(institutes);
    }

    @DeleteMapping("/institutes/{id}")
    public boolean delete(@PathVariable String id){
        int instituteId = Integer.parseInt(id);
        repository.deleteById(instituteId);
        return true;
    }
}
