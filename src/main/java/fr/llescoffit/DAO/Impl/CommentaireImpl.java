package fr.llescoffit.DAO.Impl;

import fr.llescoffit.DAO.CommentaireDAO;
import fr.llescoffit.DAO.Mapper.CommentaireMapper;
import fr.llescoffit.Model.Commentaire;
import fr.llescoffit.Model.Site;
import fr.llescoffit.Model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Timestamp;
import java.util.List;

public class CommentaireImpl implements CommentaireDAO {

    //Ajout d'un commentaire
    public void add(Commentaire com, User user,Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");
        Timestamp time = new Timestamp(System.currentTimeMillis());
        String rsql
                = "INSERT INTO Commentaire VALUES ('"+user.getNom()+"','"+time+"','"+com.getTexte()+"', '"+user.getEmail()+"', '"+site.getId()+"' ) ";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);
    }

    //Suppression d'un commentaire
    public void remove(Commentaire com, User user, Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="DELETE FROM Commentaire WHERE User_Email = '"+user.getEmail()+"' AND WHERE Site_idSite = '"+site.getId()+"' AND WHERE Date = '"+com.getDate()+"' ";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }

    //Edition d'un commentaire
    public void edit(Commentaire com, User user, Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        Timestamp time = new Timestamp(System.currentTimeMillis());
        String rsql
                ="UPDATE Commentaire SET DATE = '"+time+"' TEXTE = '"+com.getTexte()+"' WHERE User_Email = '"+user.getEmail()+"' AND WHERE Site_idSite = '"+site.getId()+"' AND WHERE Date = '"+com.getDate()+"' ";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }

    //Selection des commentaire d'un Site
    public List<Commentaire> selectfromSite(Commentaire com, Site site) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="SELECT * from Commentaire WHERE Site_idSite = '"+site.getId()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        return vJdbcTemplate.query(rsql, new CommentaireMapper());

    }

    //Selection des commentaires d'un utilisateur
    public List<Commentaire> selectfromUser(Commentaire com, User user) {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");

        String rsql
                ="SELECT * from Commentaire WHERE user_Email = '"+user.getEmail()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        return vJdbcTemplate.query(rsql, new CommentaireMapper());
    }
}
