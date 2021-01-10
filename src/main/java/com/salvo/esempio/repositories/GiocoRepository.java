package com.salvo.esempio.repositories;

import com.salvo.esempio.entities.Gioco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiocoRepository extends JpaRepository<Gioco,Long> {
    Gioco findByTitolo(String titolo);
}
