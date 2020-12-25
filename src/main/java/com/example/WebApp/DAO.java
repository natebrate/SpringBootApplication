package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Retrieve All Elements From the Staff Table
    public  List<Staff> list(){
        String sql = "SELECT * FROM Staff";

        List<Staff> listStaff = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Staff.class));
        return listStaff;
    }

    //Save the Staff Member
    public void save(Staff staff) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withSchemaName("Staff").usingColumns("StaffID", "Fname", "Lname", "Role", "password");
        BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(staff);

        insertActor.execute(parameterSource);
    }

    public Staff get(int StaffID) {
        String sql = "SELECT * FROM Staff WHERE StaffID = ?";
        Object[] args = {StaffID};
        Staff staff = jdbcTemplate.queryForObject(sql, args,
                BeanPropertyRowMapper.newInstance(Staff.class));
        return staff;
    }

    public void update(Staff staff) {
        String sql = "UPDATE Staff SET Fname=:Fname, Lname=:Lname" +
                "Role=:Role, password=:password WHERE StaffID=:StaffID ";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(staff);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
        template.update(sql,param);
    }

    // DELETE THE STAFF MEMBER
    public void delete(int StaffID) {
        String sql = "DELETE FROM Staff WHERE StaffID = ?";
        jdbcTemplate.update(sql, StaffID);
    }
}
