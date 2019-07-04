package fr.llescoffit.DAO.Impl;

import fr.llescoffit.DAO.Mapper.SiteMapper;
import fr.llescoffit.DAO.SiteDAO;
import fr.llescoffit.Model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class SiteImpl implements SiteDAO {

    // Ajout d'un Site à la base
    public void add(Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                = "INSERT INTO Site VALUES ('"+site.getNom()+"','"+site.getHauterMax()+"','"+site.getHauterMin()+"','"+site.getType()+"','"+site.getOrientation()+"','"+site.getNombreDeVoies()+"'," +
                "'"+site.getCotationMin()+"','"+site.getPays()+"','"+site.getDepartements()+"','"+site.getDescription()+"','"+site.getTopos()+"','"+site.getAccesApproche()+"','"+site.getCotationsMax()+"')";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }

    //Suppression d'un site
    public void remove(Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="DELETE FROM Site WHERE idSite = '"+site.getId()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }

    //Selection de tout les sites.
    public List<Site> select(Site site)
    {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="SELECT * from Site";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        return vJdbcTemplate.query(rsql, new SiteMapper());
    }

    //Selection de sites selon les tags
    public List<Site> selectWithTags(Site site, String rsql) {



        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        return vJdbcTemplate.query(rsql, new SiteMapper());
    }
}
