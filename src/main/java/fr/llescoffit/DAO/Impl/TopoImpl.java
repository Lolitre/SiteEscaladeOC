package fr.llescoffit.DAO.Impl;

import fr.llescoffit.DAO.Mapper.TopoMapper;
import fr.llescoffit.DAO.TopoDAO;
import fr.llescoffit.Model.Site;
import fr.llescoffit.Model.Topo;
import fr.llescoffit.Model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class TopoImpl implements TopoDAO {

    //Ajout d'un Topo  à la base de données
    public void add(Topo topo, User user, Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                = "INSERT INTO Topo VALUES ('"+topo.getNom()+"', '"+user.getEmail()+"', '"+site.getId()+"' ) ";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);
    }

    // Suppression d'un Topo
    public void remove(Topo topo, User user, Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="DELETE FROM Topo WHERE Nom = '"+topo.getNom()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }

    //Suppression des topo d'un utilisateur en cas de désinscription.
    public void removeIfUserRemoved(Topo topo, User user, Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="DELETE FROM Topo WHERE user_Email = '"+user.getEmail()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }

    //Suppression des topo d'un Site en cas de suppression de celui-ci
    public void removeIfSiteRemoved(Topo topo, User user, Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="DELETE FROM Topo WHERE Site_idSite = '"+site.getId()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }


    public List<Topo> selectfromSite(Topo topo, Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="SELECT * from Topo WHERE Site_idSite = '"+site.getId()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        return vJdbcTemplate.query(rsql, new TopoMapper());


    }

    public List<Topo> selectfromUser(Topo topo, User user) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="SELECT * from Topo WHERE user_Email = '"+user.getEmail()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        return vJdbcTemplate.query(rsql, new TopoMapper());

    }

    public void editproprietaire(Topo topo, User user) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="UPDATE Topo SET user_Email = '"+user.getEmail()+"' WHERE idTopo = '"+topo.getId()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }
}
