package fr.llescoffit.Model;

import java.io.Serializable;

public class Site implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String nom;

    private int hauterMax;

    private int hauterMin;

    private String type;

    private String orientation;

    private int nombreDeVoies;

    private String cotationsMax;

    private String cotationMin;

    private String pays;

    private String departements;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHauterMax() {
        return hauterMax;
    }

    public void setHauterMax(int hauterMax) {
        this.hauterMax = hauterMax;
    }

    public int getHauterMin() {
        return hauterMin;
    }

    public void setHauterMin(int hauterMin) {
        this.hauterMin = hauterMin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getNombreDeVoies() {
        return nombreDeVoies;
    }

    public void setNombreDeVoies(int nombreDeVoies) {
        this.nombreDeVoies = nombreDeVoies;
    }

    public String getCotationsMax() {
        return cotationsMax;
    }

    public void setCotationsMax(String cotationsMax) {
        this.cotationsMax = cotationsMax;
    }

    public String getCotationMin() {
        return cotationMin;
    }

    public void setCotationMin(String cotationMin) {
        this.cotationMin = cotationMin;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getDepartements() {
        return departements;
    }

    public void setDepartements(String departements) {
        this.departements = departements;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTopos() {
        return topos;
    }

    public void setTopos(String topos) {
        this.topos = topos;
    }

    public String getAccesApproche() {
        return accesApproche;
    }

    public void setAccesApproche(String accesApproche) {
        this.accesApproche = accesApproche;
    }

    private String description;

    private String topos;

    private String accesApproche;

}
