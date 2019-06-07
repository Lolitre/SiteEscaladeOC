package fr.llescoffit.DAO.Mapper;


import fr.llescoffit.Model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    public User mapRow(ResultSet rs, int Rownum) throws SQLException{
        User user = new User();
        user.setEmail(rs.getString(1));
        user.setMotDePasse(rs.getString(2));
        user.setNom(rs.getString(3));
        return user;
    }
}
