package com.salvo.esempio.controller;

import com.salvo.esempio.entities.Gioco;
import com.salvo.esempio.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@Controller
@RequestMapping("/")
public class MainTest {



    @Autowired
    @Qualifier("gioco")
    IService giocoService;


    //@GetMapping(value = "gioco")
    //@ResponseBody
   // public Gioco giocoPerTitolo(String titolo){
       // return giocoService.cercaPertitolo(titolo);
    //}

    @PostMapping(value = "updateGioco")
    @ResponseBody
    public void modGioco(Gioco g){


        g = new Gioco();
        g.setId(6L);
        g.setDate(Date.valueOf("2020-10-10"));
        g.setTitolo("Pinoooo");
        g.setPiattaforma("ps9");
        g.setPosizioneCasa("sini");
        g.setPrestato(false);
        g.setProprietarioOggetto("ffdvfdvfv ioiiiiiiii");
        g.setCasaSviluppo("nS");
        giocoService.inserisciModificaOggetto(g);
    }

}
