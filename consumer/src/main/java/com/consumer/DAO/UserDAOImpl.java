package com.consumer.DAO;

import com.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAOImpl extends AbstractDAOImpl implements UserDAO{

    //TODO
    public void add(User user){

        String rsql
                = "INSERT INTO User VALUES ('"+user.getEmail()+"', '"+user.getMotdePasse()+"', '"+user.getNom()+"' ) ";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        vJdbcTemplate.update(rsql);

    }

    public void changeMdp(User user) {

        String rsql
                ="UPDATE User SET MotDePasse = '"+user.getMotdePasse()+"' WHERE Email = '"+user.getEmail()+"'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        vJdbcTemplate.update(rsql);

    }

    public void remove(User user) {

    }
}
