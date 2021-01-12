package com.salvo.esempio.service;

import com.salvo.esempio.entities.Gioco;
import com.salvo.esempio.entities.Libro;
import com.salvo.esempio.repositories.GiocoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class GiocoService {
    @Autowired
    GiocoRepository giocoRepository;

    //Da approfondire il salvataggio cache
   // public List<Gioco>elencoCacheGiochi;



    public List<Gioco> listaGiochi(){

       // elencoCacheGiochi.clear();
       // elencoCacheGiochi = new ArrayList<>();
       // elencoCacheGiochi.addAll((List<Gioco>) giocoRepository.findAll());
       // return elencoCacheGiochi;
        return (List<Gioco>) giocoRepository.findAll();
    }

    public Gioco cercaPertitolo(String titoloGioco){
        return giocoRepository.findByTitolo(titoloGioco);


    }

    public void inserisciModificaGioco(Gioco g){

                    giocoRepository.saveAndFlush(g);
        }


    public List<Gioco>trovaGiochiDaId(Long id){
        return giocoRepository.findAllById(Collections.singleton(id));
    }

    public void eliminaGioco(Long id){
        for (Gioco  g : giocoRepository.findAll()){
            if(id == g.getId()){
                giocoRepository.delete(g);
            }
        }
    }
}
