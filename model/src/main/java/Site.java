import java.util.List;
import java.io.Serializable;

public class Site implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idSite;

    private String nom;

    private String type;

    //bi-directional many-to-one association to Secteur
    //OneToMany(mappedBy="site")
    private List<Secteur> secteurs;

    //bi-directional many-to-one association to Lieu
    //ManyToOne
    private Lieu lieu;

    //bi-directional many-to-one association to Topo
    //ManyToOne
    private Topo topo;

    public Site() {
    }

    public int getIdSite() {
        return this.idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Secteur> getSecteurs() {
        return this.secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public Secteur addSecteur(Secteur secteur) {
        getSecteurs().add(secteur);
        secteur.setSite(this);

        return secteur;
    }

    public Secteur removeSecteur(Secteur secteur) {
        getSecteurs().remove(secteur);
        secteur.setSite(null);

        return secteur;
    }

    public Lieu getLieu() {
        return this.lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public Topo getTopo() {
        return this.topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

}
