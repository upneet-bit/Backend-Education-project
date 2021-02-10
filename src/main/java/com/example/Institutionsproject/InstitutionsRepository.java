package com.example.Institutionsproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;

public interface InstitutionsRepository extends JpaRepository<Institutions, Integer> {}
//
//    @Query("select i from Insitutions i where i.name = ?1",nativeQuery = true)
//    Institutions findByName(String name);
//    }
