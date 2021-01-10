package com.salvo.esempio.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gioco")
public class Gioco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String titolo;
    private String casaSviluppo;
    private String piattaforma;
    @Temporal(TemporalType.DATE)
    private Date date;
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

    public String getCasaSviluppo() {
        return casaSviluppo;
    }

    public void setCasaSviluppo(String casaSviluppo) {
        this.casaSviluppo = casaSviluppo;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        return "Gioco{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", casaSviluppo='" + casaSviluppo + '\'' +
                ", piattaforma='" + piattaforma + '\'' +
                ", date=" + date +
                ", proprietarioOggetto='" + proprietarioOggetto + '\'' +
                ", posizioneCasa='" + posizioneCasa + '\'' +
                ", prestato=" + prestato +
                '}';
    }
}
