package tempModel;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;


    private String email;

    private String motdePasse;

    private String nom;

    //bi-directional many-to-one association to Commentaire
    //OneToMany(mappedBy="user")
    private List<Commentaire> commentaires;

    //bi-directional many-to-one association to Topo
    //OneToMany(mappedBy="user")
    private List<Topo> topos;

    public User() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdePasse() {
        return this.motdePasse;
    }

    public void setMotdePasse(String motdePasse) {
        this.motdePasse = motdePasse;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Commentaire> getCommentaires() {
        return this.commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Commentaire addCommentaire(Commentaire commentaire) {
        getCommentaires().add(commentaire);
        commentaire.setUser(this);

        return commentaire;
    }

    public Commentaire removeCommentaire(Commentaire commentaire) {
        getCommentaires().remove(commentaire);
        commentaire.setUser(null);

        return commentaire;
    }

    public List<Topo> getTopos() {
        return this.topos;
    }

    public void setTopos(List<Topo> topos) {
        this.topos = topos;
    }

    public Topo addTopo(Topo topo) {
        getTopos().add(topo);
        topo.setUser(this);

        return topo;
    }

    public Topo removeTopo(Topo topo) {
        getTopos().remove(topo);
        topo.setUser(null);

        return topo;
    }

}