package fr.llescoffit.DAO.Mapper;

import fr.llescoffit.Model.Site;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SiteMapper implements RowMapper<Site> {
    public Site mapRow(ResultSet rs, int Rownum) throws SQLException{
        Site site = new Site();
        site.setId(rs.getInt(1));
        site.setNom(rs.getString(2));
        site.setHauterMax(rs.getInt(3));
        site.setHauterMin(rs.getInt(4));
        site.setType(rs.getString(5));
        site.setOrientation(rs.getString(6));
        site.setNombreDeVoies(rs.getInt(7));
        site.setCotationMin(rs.getString(8));
        site.setPays(rs.getString(9));
        site.setDepartements(rs.getString(10));
        site.setDescription(rs.getString(11));
        site.setTopos(rs.getString(12));
        site.setAccesApproche(rs.getString(13));
        site.setCotationsMax(rs.getString(14));

        return site;


    }

}
