package fr.llescoffit.DAO;

import fr.llescoffit.Model.Site;

import java.util.List;

public interface SiteDAO {


    void add(Site site);

    void remove(Site site);

    List<Site> select(Site site);

    List<Site> selectWithTags(Site site,String rsql);
}
