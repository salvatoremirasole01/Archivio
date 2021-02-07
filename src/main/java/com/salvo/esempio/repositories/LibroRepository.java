package com.salvo.esempio.repositories;

import com.salvo.esempio.entities.Gioco;
import com.salvo.esempio.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long> {
   @Transactional
   @Modifying
   @Query("DELETE FROM Libro b WHERE b.id = ?1")
   void eliminaLibro(Long id);
   //Questi sono i due modi, diversi, per creare delle query personalizzare con Spring Data JPA
   Libro findByTitolo(String titolo);
}
