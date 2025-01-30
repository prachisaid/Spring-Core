package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImplement;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.springjdbc")
public class JdbcConfig {
    
    @Bean(name = {"ds"})
    public DataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?autoReconnect=true&useSSL=false");
        ds.setUsername("root");
        ds.setPassword("password");
        
        return ds;
    }
    
    
    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(this.getDataSource());
        
        return jdbcTemplate;
    }
    
//    @Bean("studentDao")
//    public StudentDao getStudentDao() {
//        StudentDaoImplement studentDao = new StudentDaoImplement();
//        studentDao.setJdbcTemplate(getTemplate());
//        
//        return studentDao;
//    }
//    
}
