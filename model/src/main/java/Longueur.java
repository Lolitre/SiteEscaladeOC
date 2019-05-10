import java.io.Serializable;
import java.util.List;

public class Longueur implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idLongueur;

    //bi-directional many-to-one association to Voie
    //ManyToOne
    private Voie voie;

    //bi-directional many-to-many association to Difficulte
    /*ManyToMany
    @JoinTable(
            name="longueur_difficulte"
            , joinColumns={
            @JoinColumn(name="longueur_idLongueur")
    }
            , inverseJoinColumns={
            @JoinColumn(name="difficulte_idDifficulte")
    }
    )*/

    private List<Difficulte> difficultes;

    public Longueur() {
    }

    public int getIdLongueur() {
        return this.idLongueur;
    }

    public void setIdLongueur(int idLongueur) {
        this.idLongueur = idLongueur;
    }

    public Voie getVoie() {
        return this.voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    public List<Difficulte> getDifficultes() {
        return this.difficultes;
    }

    public void setDifficultes(List<Difficulte> difficultes) {
        this.difficultes = difficultes;
    }

}