package com.salvo.esempio.entities;

import com.salvo.esempio.service.GiocoService;
import com.salvo.esempio.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class Gestore {

    public List<Object>lista;
    @Autowired
    LibroService libroService;
    @Autowired
    GiocoService giocoService;


    public Gestore() {
        this.lista = new ArrayList<>();
        lista.addAll(libroService.lista());
        lista.addAll(giocoService.listaGiochi());


    }

}
