import java.io.Serializable;
import java.util.List;

public class Voie implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idVoie;

    private String nom;

    //bi-directional many-to-one association to Longueur
    //OneToMany(mappedBy="voie")
    private List<Longueur> longueurs;

    //bi-directional many-to-one association to Secteur
    //ManyToOne
    private Secteur secteur;

    //bi-directional many-to-many association to Difficulte
    /*ManyToMany
    @JoinTable(
            name="voie_difficulte"
            , joinColumns={
            @JoinColumn(name="voie_idVoie")
    }
            , inverseJoinColumns={
            @JoinColumn(name="difficulte_idDifficulte")
    }
    )*/
    private List<Difficulte> difficultes;

    public Voie() {
    }

    public int getIdVoie() {
        return this.idVoie;
    }

    public void setIdVoie(int idVoie) {
        this.idVoie = idVoie;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Longueur> getLongueurs() {
        return this.longueurs;
    }

    public void setLongueurs(List<Longueur> longueurs) {
        this.longueurs = longueurs;
    }

    public Longueur addLongueur(Longueur longueur) {
        getLongueurs().add(longueur);
        longueur.setVoie(this);

        return longueur;
    }

    public Longueur removeLongueur(Longueur longueur) {
        getLongueurs().remove(longueur);
        longueur.setVoie(null);

        return longueur;
    }

    public Secteur getSecteur() {
        return this.secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public List<Difficulte> getDifficultes() {
        return this.difficultes;
    }

    public void setDifficultes(List<Difficulte> difficultes) {
        this.difficultes = difficultes;
    }

}