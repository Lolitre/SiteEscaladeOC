package com.model;

import java.io.Serializable;
import java.util.List;

public class Difficulte implements Serializable {
    private static final long serialVersionUID = 1L;


    //TODO ajouter les iddifucltés dans le script de création de la base de données.

    private int idDifficulte;

    private String niveau;

    public Difficulte() {
    }

    public int getIdDifficulte() {
        return this.idDifficulte;
    }

    public void setIdDifficulte(int idDifficulte) {
        this.idDifficulte = idDifficulte;
    }

    public String getNiveau() {
        return this.niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

}
