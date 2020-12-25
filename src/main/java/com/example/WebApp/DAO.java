package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.List;
public class DAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public  List<Staff> list(){
        String sql = "SELECT * FROM Staff";

        List<Staff> listStaff = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Staff.class));
        return listStaff;
    }

    public void save(Staff staff) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withSchemaName("Staff").usingColumns("StaffID", "Fname", "Lname", "Role", "password");
        BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(staff);

        insertActor.execute(parameterSource);
    }

    public Staff get(int StaffID) {
        return null;
    }

    public void update(Staff staff) {
    }

    public void delete(int StaffID) {
    }
}
