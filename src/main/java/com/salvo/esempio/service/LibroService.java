package com.salvo.esempio.service;

import com.salvo.esempio.entities.Libro;
import com.salvo.esempio.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
public class LibroService implements IService<Libro> {

    @Autowired
    public LibroRepository libroRepository;




    @Override
    public Libro prendiOggetto(Long id){
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminaOggetto(Long id){
        for (Libro b : libroRepository.findAll()){
            if(id == b.getId()){
                libroRepository.eliminaLibro(id);
            }
        }
    }

    @Override
    public Libro cercaPertitolo(String titoloGioco) {
        return (Libro) libroRepository.findByTitolo(titoloGioco);
    }


    @Override
    public List<Libro> listaOggetti() {
        return (List<Libro>) libroRepository.findAll();
    }

    @Override
    public void inserisciModificaOggetto(Libro l) {
        for(Libro b : libroRepository.findAll()){
            if(l.getId()== b.getId()){
                b = l;
            }
            else
                libroRepository.save(b);
        }
    }
}
