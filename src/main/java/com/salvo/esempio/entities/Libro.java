package com.salvo.esempio.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String titolo;
    private String autore;
    @Temporal(TemporalType.DATE)
    private Date date;
    private int nPagine;
    private String proprietarioOggetto;
    private String posizioneCasa;
    private boolean prestato;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getnPagine() {
        return nPagine;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }

    public String getProprietarioOggetto() {
        return proprietarioOggetto;
    }

    public void setProprietarioOggetto(String proprietarioOggetto) {
        this.proprietarioOggetto = proprietarioOggetto;
    }

    public String getPosizioneCasa() {
        return posizioneCasa;
    }

    public void setPosizioneCasa(String posizioneCasa) {
        this.posizioneCasa = posizioneCasa;
    }

    public boolean isPrestato() {
        return prestato;
    }

    public void setPrestato(boolean prestato) {
        this.prestato = prestato;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", date=" + date +
                ", nPagine=" + nPagine +
                ", proprietarioOggetto='" + proprietarioOggetto + '\'' +
                ", posizioneCasa='" + posizioneCasa + '\'' +
                ", prestato=" + prestato +
                '}';
    }
}
