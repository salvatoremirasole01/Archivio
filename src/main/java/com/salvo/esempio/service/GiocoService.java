package com.salvo.esempio.service;

import com.salvo.esempio.entities.Gioco;
import com.salvo.esempio.repositories.GiocoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GiocoService implements IService<Gioco> {
    @Autowired
    GiocoRepository giocoRepository;

    //Da approfondire il salvataggio cache
   // public List<Gioco>elencoCacheGiochi;



    @Override
    public List<Gioco> listaOggetti(){
        return (List<Gioco>) giocoRepository.findAll();
    }

    @Override
    public void inserisciModificaOggetto(Gioco g) {
        giocoRepository.saveAndFlush(g);
    }


    @Override
    public Gioco cercaPertitolo(String titoloGioco){
        return (Gioco) giocoRepository.findByTitolo(titoloGioco);
    }

    @Override
    public Gioco prendiOggetto(Long id){
        return giocoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminaOggetto(Long id){
        for (Gioco  g : giocoRepository.findAll()){
            if(id == g.getId()){
                giocoRepository.delete(g);
            }
        }
    }
}
