package fr.llescoffit.DAO.Mapper;

import fr.llescoffit.Model.Commentaire;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentaireMapper implements RowMapper<Commentaire> {
    public Commentaire mapRow(ResultSet rs, int Rownum) throws SQLException{
        Commentaire com = new Commentaire();
        com.setAuteur(rs.getString(1));
        com.setDate(rs.getDate(2));
        com.setTexte(rs.getString(3));
        com.setUserEmail(rs.getString(4));
        com.setIdSite(rs.getInt(5));
        return com;
    }
}
