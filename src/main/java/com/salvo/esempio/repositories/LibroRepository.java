package com.salvo.esempio.repositories;

import com.salvo.esempio.entities.Gioco;
import com.salvo.esempio.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long> {
   //@Query("DELETE FROM Libro b WHERE b.id = ?1")
   //void eliminaLibro(Long id);
   Libro findByTitolo(String titolo);
}
