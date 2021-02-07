package com.salvo.esempio.controller;


import com.salvo.esempio.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class LibroController {
    @Autowired
    @Qualifier("libro")
    IService libroService;

    @GetMapping("/libri")
    public String es(Model mod){
        mod.addAttribute("elencoLibri",libroService.listaOggetti());
        return "libri";
    }

    @GetMapping(value ="/libri/{titolo}")//http://localhost:8080/libri/re   : esempio di chiamata
    public String cercaTitolo(@PathVariable("titolo") String titolo, Model mod){
      mod.addAttribute("libroTitolo",libroService.cercaPertitolo(titolo));
        return "libro_uno";
    }


    @PostMapping(value = "/libri/{id}")
    public void eliminaLibro(@PathVariable("id")Long id){
        libroService.eliminaOggetto(id);
    }
}
