package fr.llescoffit.Model;

import java.io.Serializable;
import java.sql.Date;

public class Commentaire implements Serializable {

    private static final long serialVersionUID = 1L;

    private String auteur;

    private Date date;

    private String texte;

    private String userEmail;

    private int idSite;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }
}
