package com.salvo.esempio.controller;

import com.salvo.esempio.entities.Gioco;
import com.salvo.esempio.entities.Libro;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service qui non e' obbligatoria perche ho costruito dei bean manualmente
public interface IService<T>{
    List<T> listaOggetti();
    void inserisciModificaOggetto(T l);
    T prendiOggetto(Long id);
    void eliminaOggetto(Long id);
    T cercaPertitolo(String titoloGioco);
}
