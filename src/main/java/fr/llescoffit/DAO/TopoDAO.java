package fr.llescoffit.DAO;

import fr.llescoffit.Model.Site;
import fr.llescoffit.Model.Topo;
import fr.llescoffit.Model.User;

import java.util.List;

public interface TopoDAO {

    void add(Topo topo, User user, Site site);

    void remove(Topo topo, User user, Site site);

    void removeIfUserRemoved(Topo topo, User user, Site site);

    void removeIfSiteRemoved(Topo topo, User user, Site site);

    List<Topo> selectfromSite(Topo topo, Site site);

    List<Topo> selectfromUser(Topo topo,User user);

    void editproprietaire(Topo topo, User user);

}
