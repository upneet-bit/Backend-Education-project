package com.example.Institutionsproject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Institutions {

    public @Id @GeneratedValue int id;
    public String name;
    public String location;
    public String email;
    public String excerpt;

    public Institutions(){

    }
    public Institutions(String name,String location, String email, String excerpt){
        this.name=name;
        this.email=email;
        this.location=location;
        this.excerpt=excerpt;
    }
}
