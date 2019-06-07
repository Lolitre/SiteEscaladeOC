package fr.llescoffit.DAO.Impl;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


public abstract class AbstractDAOImpl {

    private DataSource dataSource;

    protected DataSource getDataSource() {

        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/siteescalade ?useUnicode=true\n" +
                "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&\n" +
                "serverTimezone=UTC");
        source.setUsername("root");
        source.setPassword("Lolfolder");
        return dataSource;
    }



}
