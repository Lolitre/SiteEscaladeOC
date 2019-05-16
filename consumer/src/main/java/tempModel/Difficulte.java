package tempModel;

import java.io.Serializable;
import java.util.List;

public class Difficulte implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idDifficulte;

    private String niveau;

    //bi-directional many-to-many association to Longueur
    //ManyToMany(mappedBy="difficultes")
    private List<Longueur> longueurs;

    //bi-directional many-to-many association to Voie
    //ManyToMany(mappedBy="difficultes")
    private List<Voie> voies;

    public Difficulte() {
    }

    public int getIdDifficulte() {
        return this.idDifficulte;
    }

    public void setIdDifficulte(int idDifficulte) {
        this.idDifficulte = idDifficulte;
    }

    public String getNiveau() {
        return this.niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public List<Longueur> getLongueurs() {
        return this.longueurs;
    }

    public void setLongueurs(List<Longueur> longueurs) {
        this.longueurs = longueurs;
    }

    public List<Voie> getVoies() {
        return this.voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

}


enum Difficulteset {
    TROIS {
        public String toString() {
            return "3";
        }
    },
    TROISP {
        public String toString() {
            return "3+";
        }
    },
    QUATREA {
        public String toString() {
            return "4a";
        }
    },
    QUATREB {
        public String toString() {
            return "4b";
        }
    },
    QUATREC {
        public String toString() {
            return "4c";
        }
    },
    CINQA {
        public String toString() {
            return "5a";
        }
    },
    CINQB {
        public String toString() {
            return "5b";
        }
    },
    CINQC {
        public String toString() {
            return "5c";
        }
    },
    SIXA {
        public String toString() {
            return "6a";
        }
    },
    SIXAP {
        public String toString() {
            return "6a+";
        }
    },
    SIXB {
        public String toString() {
            return "6b";
        }
    },
    SIXBP {
        public String toString() {
            return "6b+";
        }
    },
    SIXC {
        public String toString() {
            return "6c";
        }
    },
    SIXCP {
        public String toString() {
            return "6c+";
        }
    },
    SEPTA {
        public String toString() {
            return "7a";
        }
    },
    SEPTAP {
        public String toString() {
            return "7a+";
        }
    },
    SEPTB {
        public String toString() {
            return "7b";
        }
    },
    SEPTBP {
        public String toString() {
            return "7b+";
        }
    },
    SEPTC {
        public String toString() {
            return "7c";
        }
    },
    SEPTCP {
        public String toString() {
            return "7c+";
        }
    },
    HUITA {
        public String toString() {
            return "8a";
        }
    },
    HUITAP {
        public String toString() {
            return "8a+";
        }
    },
    HUITB {
        public String toString() {
            return "8b";
        }
    },
    HUITBP {
        public String toString() {
            return "8b+";
        }
    },
    HUITC {
        public String toString() {
            return "8c";
        }
    },
    HUITCP {
        public String toString() {
            return "8c+";
        }
    },
    NEUFA {
        public String toString() {
            return "9a";
        }
    },
    NEUFAP {
        public String toString() {
            return "9a+";
        }
    },

}
