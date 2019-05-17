package com.model;

import java.io.Serializable;
import java.util.List;

public class Topo implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idTopo;

    private String datedeParution;

    private String description;

    private String nom;

    private String region;

    //bi-directional many-to-one association to com.model.Commentaire
    //OneToMany(mappedBy="topo")
    private List<Commentaire> commentaires;

    //bi-directional many-to-one association to com.model.Site
    //OneToMany(mappedBy="topo")
    private List<Site> sites;

    //bi-directional many-to-many association to com.model.Tag
    //ManyToMany(mappedBy="topos")
    private List<Tag> tags;

    //bi-directional many-to-one association to com.model.User
    //ManyToOne
    private User user;

    public Topo() {
    }

    public int getIdTopo() {
        return this.idTopo;
    }

    public void setIdTopo(int idTopo) {
        this.idTopo = idTopo;
    }

    public String getDatedeParution() {
        return this.datedeParution;
    }

    public void setDatedeParution(String datedeParution) {
        this.datedeParution = datedeParution;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Commentaire> getCommentaires() {
        return this.commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Commentaire addCommentaire(Commentaire commentaire) {
        getCommentaires().add(commentaire);
        commentaire.setTopo(this);

        return commentaire;
    }

    public Commentaire removeCommentaire(Commentaire commentaire) {
        getCommentaires().remove(commentaire);
        commentaire.setTopo(null);

        return commentaire;
    }

    public List<Site> getSites() {
        return this.sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public Site addSite(Site site) {
        getSites().add(site);
        site.setTopo(this);

        return site;
    }

    public Site removeSite(Site site) {
        getSites().remove(site);
        site.setTopo(null);

        return site;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

