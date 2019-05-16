package tempModel;

import java.io.Serializable;

public class Commentaire implements Serializable {
    private static final long serialVersionUID = 1L;


    private String auteur;

    private String date;

    private String texte;

    //bi-directional many-to-one association to Topo
    //ManyToOne
    private Topo topo;

    //bi-directional many-to-one association to User
    //ManyToOne
    private User user;

    public Commentaire() {
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTexte() {
        return this.texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Topo getTopo() {
        return this.topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}