package com.salvo.esempio.controller;

import com.salvo.esempio.entities.Gioco;
import com.salvo.esempio.entities.Libro;
import com.salvo.esempio.service.GiocoService;
import com.salvo.esempio.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainTest {

    @Autowired
    @Qualifier("libro")
    IService libroService;


    @Autowired
    @Qualifier("gioco")
    IService giocoService;

    @GetMapping("/libri")
    public String es(Model mod){
        mod.addAttribute("elencoLibri",libroService.listaOggetti());
        return "libri";
    }
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
