package fr.llescoffit.DAO;

import fr.llescoffit.Model.Site;

public interface SiteDAO {


    void add(Site site);

    void remove(Site site);

    void edit(Site site);

    void select(Site site);

    void selectwithtags(Site site,String rsql);
}
