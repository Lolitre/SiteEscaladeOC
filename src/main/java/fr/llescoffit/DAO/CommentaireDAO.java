package fr.llescoffit.DAO;

import fr.llescoffit.Model.Commentaire;
import fr.llescoffit.Model.Site;
import fr.llescoffit.Model.User;

import java.util.List;

public interface CommentaireDAO{

    void add(Commentaire com, User user,Site site);

    void remove(Commentaire com,User user,Site site);

    void edit(Commentaire com,User user, Site site);

    List<Commentaire> selectfromSite(Commentaire com, Site site);

    List<Commentaire> selectfromUser(Commentaire com, User user);
}
