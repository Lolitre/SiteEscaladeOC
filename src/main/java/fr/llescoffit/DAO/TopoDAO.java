package fr.llescoffit.DAO;

import fr.llescoffit.Model.Site;
import fr.llescoffit.Model.Topo;
import fr.llescoffit.Model.User;

public interface TopoDAO {

    void add(Topo topo, User user, Site site);

    void remove(Topo topo, User user, Site site);

    void selectfromSite(Topo topo,Site site);

    void selectfromUSer(Topo topo,User user);

    void editproprietaire(Topo topo, User user);

}
