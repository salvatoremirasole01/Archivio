package com.salvo.esempio.service;

import com.salvo.esempio.controller.IService;
import com.salvo.esempio.entities.Gioco;
import com.salvo.esempio.entities.Libro;
import com.salvo.esempio.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
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
                libroRepository.delete(b);
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
