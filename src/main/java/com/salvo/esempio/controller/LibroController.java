package com.salvo.esempio.controller;


import com.salvo.esempio.entities.Libro;
import com.salvo.esempio.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/libri/{titolo}")
    public String cercaTitolo(@PathVariable String titolo, Model mod){
      mod.addAttribute("libroTitolo",libroService.cercaPertitolo(titolo));
        System.out.println(mod.addAttribute("libroTitolo",libroService.cercaPertitolo(titolo)));
        return "libro";
    }
}
