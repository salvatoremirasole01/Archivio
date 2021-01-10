package com.salvo.esempio.service;

import com.salvo.esempio.entities.Libro;
import com.salvo.esempio.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Service
public class LibroService{
    @Autowired
    public LibroRepository libroRepository;




    public List<Libro> lista(){
        return (List<Libro>) libroRepository.findAll();
    }

    public void inserisciModificaLibro(Libro l){
        for(Libro b : libroRepository.findAll()){
            if(l.getId()== b.getId()){
                b = l;
            }
            else
                libroRepository.save(b);
        }
    }

    public Libro prendiLibro(Long id){
        return libroRepository.findById(id).orElse(null);
    }

    public void eliminaLibro(Long id){
        for (Libro b : libroRepository.findAll()){
            if(id == b.getId()){
                libroRepository.delete(b);
            }
        }
    }






}
