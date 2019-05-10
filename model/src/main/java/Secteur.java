import java.util.List;
import java.io.Serializable;

public class Secteur implements Serializable {
    private static final long serialVersionUID = 1L;

    //Id
    private int idSecteur;

    private int hauterMax;

    private int hauterMin;

    private int longueurTotaledesVoies;

    private int nombredeVoies;

    private String secteurcol;

    //bi-directional many-to-one association to Site
    //ManyToOne
    private Site site;

    //bi-directional many-to-one association to Voie
    //OneToMany(mappedBy="secteur")
    private List<Voie> voies;

    public Secteur() {
    }

    public int getIdSecteur() {
        return this.idSecteur;
    }

    public void setIdSecteur(int idSecteur) {
        this.idSecteur = idSecteur;
    }

    public int getHauterMax() {
        return this.hauterMax;
    }

    public void setHauterMax(int hauterMax) {
        this.hauterMax = hauterMax;
    }

    public int getHauterMin() {
        return this.hauterMin;
    }

    public void setHauterMin(int hauterMin) {
        this.hauterMin = hauterMin;
    }

    public int getLongueurTotaledesVoies() {
        return this.longueurTotaledesVoies;
    }

    public void setLongueurTotaledesVoies(int longueurTotaledesVoies) {
        this.longueurTotaledesVoies = longueurTotaledesVoies;
    }

    public int getNombredeVoies() {
        return this.nombredeVoies;
    }

    public void setNombredeVoies(int nombredeVoies) {
        this.nombredeVoies = nombredeVoies;
    }

    public String getSecteurcol() {
        return this.secteurcol;
    }

    public void setSecteurcol(String secteurcol) {
        this.secteurcol = secteurcol;
    }

    public Site getSite() {
        return this.site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public List<Voie> getVoies() {
        return this.voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

    public Voie addVoy(Voie voy) {
        getVoies().add(voy);
        voy.setSecteur(this);

        return voy;
    }

    public Voie removeVoy(Voie voy) {
        getVoies().remove(voy);
        voy.setSecteur(null);

        return voy;
    }

}
