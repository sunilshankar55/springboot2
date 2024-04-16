package com.example.rail3.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.rail3.model.Ivtmg;

@Repository
public interface IvtmgRepo extends JpaRepository<Ivtmg, Integer> {
    @Query("SELECT i FROM Ivtmg i WHERE i.username = ?1")
    Page<Ivtmg> findByUsername(String username, Pageable pageable);
}