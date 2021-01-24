package com.salvo.esempio.controller;

import com.salvo.esempio.entities.Gioco;

import java.util.List;

public interface IService<T>{
    List<T> listaOggetti();
}
