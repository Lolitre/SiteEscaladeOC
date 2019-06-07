package fr.llescoffit.DAO.Impl;

import fr.llescoffit.DAO.Mapper.UserMapper;
import fr.llescoffit.DAO.UserDAO;
import fr.llescoffit.Model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

public class UserImpl extends AbstractDAOImpl implements UserDAO {


    // Ajout d'un utilisateur dans la base de données.
    public void add(User user){

            DriverManagerDataSource source = new DriverManagerDataSource();
            source.setDriverClassName("com.mysql.cj.jdbc.Driver");
            source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?userUniqcode= true &&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC");
            source.setUsername("root");
            source.setPassword("Lolfolder");
            System.out.println("Test initialisation data Source");

        String rsql
                = "INSERT INTO User VALUES ('"+user.getEmail()+"', '"+user.getMotDePasse()+"', '"+user.getNom()+"' ) ";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(source);
        vJdbcTemplate.update(rsql);

    }

    // Changement du mot passe à la demande de l'utilisateur.
    public void changeMDP(User user) {

        String rsql
                ="UPDATE User SET MotDePasse = '"+user.getMotDePasse()+"' WHERE Email = '"+user.getEmail()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        vJdbcTemplate.update(rsql);

    }

    // Suppresion du compte d'un utilisateur.
    public void remove(User user) {
        String rsql
                ="DELETE FROM User WHERE Email = '"+user.getEmail()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        vJdbcTemplate.update(rsql);
    }

    // Selection de tout les utilisateurs.
    public List<User> select(){
        String rsql
                ="SELECT * from User";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        return vJdbcTemplate.query(rsql, new UserMapper());


    }

    // Récupération du mot de passe d'un utilisateur pour vérification nécessaire à la connexion.
    public String connexion(User user){
        String result = null;
        String rsql
                ="SELECT MotdePasse from User WHERE Email = '"+user.getEmail()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        result = vJdbcTemplate.queryForObject(rsql, String.class);
        return result;

    }

}

