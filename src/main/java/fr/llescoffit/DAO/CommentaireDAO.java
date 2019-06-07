package fr.llescoffit.DAO;

import fr.llescoffit.Model.Commentaire;
import fr.llescoffit.Model.Site;
import fr.llescoffit.Model.User;

public interface CommentaireDAO{

    void add(Commentaire com, User user);

    void remove(Commentaire com,User user);

    void edit(Commentaire com,User user);

    void selectfromSite(Commentaire com, Site site);

    void selectfromUser(Commentaire com, User user);
}
