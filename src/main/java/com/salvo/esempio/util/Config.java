package com.salvo.esempio.util;

import com.salvo.esempio.service.IService;
import com.salvo.esempio.service.GiocoService;
import com.salvo.esempio.service.LibroService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("gioco")
    public IService gioco() {
        return new GiocoService();
    }

    @Bean("libro")
    public IService libro() {
        return new LibroService();
    }
}
