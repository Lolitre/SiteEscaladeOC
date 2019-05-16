package tempModel;

import java.io.Serializable;
import java.util.List;

public class Tag implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idTags;

    private String nom;

    //bi-directional many-to-many association to Topo
    //ManyToMany
    /*JoinTable(
            name="tags_topo"
            , joinColumns={
            @JoinColumn(name="Tags_idTags")
    }
            , inverseJoinColumns={
            @JoinColumn(name="Topo_idTopo")
    }
    )*/
    private List<Topo> topos;

    public Tag() {
    }

    public int getIdTags() {
        return this.idTags;
    }

    public void setIdTags(int idTags) {
        this.idTags = idTags;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Topo> getTopos() {
        return this.topos;
    }

    public void setTopos(List<Topo> topos) {
        this.topos = topos;
    }

}