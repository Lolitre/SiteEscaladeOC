package fr.llescoffit.Model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String email;

    private String motDePasse;

    private String nom;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
