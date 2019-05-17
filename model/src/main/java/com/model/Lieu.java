package com.model;

import java.io.Serializable;
import java.util.List;

public class Lieu implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idLieu;

    private String accesRoutier;

    private int altitude;

    private String approche;

    private String massif;

    private String orientation;

    private String remarques;

    private String ville;

    //bi-directional many-to-one association to com.model.Site
    //OneToMany(mappedBy="lieu")
    private List<Site> sites;

    public Lieu() {
    }

    public int getIdLieu() {
        return this.idLieu;
    }

    public void setIdLieu(int idLieu) {
        this.idLieu = idLieu;
    }

    public String getAccesRoutier() {
        return this.accesRoutier;
    }

    public void setAccesRoutier(String accesRoutier) {
        this.accesRoutier = accesRoutier;
    }

    public int getAltitude() {
        return this.altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public String getApproche() {
        return this.approche;
    }

    public void setApproche(String approche) {
        this.approche = approche;
    }

    public String getMassif() {
        return this.massif;
    }

    public void setMassif(String massif) {
        this.massif = massif;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getRemarques() {
        return this.remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Site> getSites() {
        return this.sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public Site addSite(Site site) {
        getSites().add(site);
        site.setLieu(this);

        return site;
    }

    public Site removeSite(Site site) {
        getSites().remove(site);
        site.setLieu(null);

        return site;
    }

}