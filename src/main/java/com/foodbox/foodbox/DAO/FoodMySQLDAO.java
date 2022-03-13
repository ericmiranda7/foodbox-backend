package com.foodbox.foodbox.DAO;

import com.foodbox.foodbox.models.Food;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodMySQLDAO extends AbstractDAO {

    public FoodMySQLDAO(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public Object getOneById(int id) {
        return null;
    }

    @Override
    public List<Food> getAll() {
        return this.jdbcTemplate
                .query("SELECT * FROM foods", new BeanPropertyRowMapper<>(Food.class));
    }
}
