package fr.llescoffit.DAO.Mapper;

import fr.llescoffit.Model.Topo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TopoMapper implements RowMapper<Topo> {
    public Topo mapRow(ResultSet rs,int Rownum) throws SQLException{
        Topo topo = new Topo();
        topo.setId(rs.getInt(1));
        topo.setNom(rs.getString(2));
        topo.setUserEmail(rs.getString(3));
        topo.setIdSite(rs.getInt(4));
    return topo;
    }

}
