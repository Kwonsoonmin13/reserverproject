package kr.or.connect.reserverproject.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.reserverproject.dto.Promotion;
import static kr.or.connect.reserverproject.dao.ReserverSql.*;

@Repository
public class PromotionDao {
	private NamedParameterJdbcTemplate jdbc ;
	private RowMapper<Promotion> rowMapper = BeanPropertyRowMapper.newInstance(Promotion.class);
	
	public PromotionDao(DataSource dataSource) {
		this.jdbc=new NamedParameterJdbcTemplate(dataSource);
	}
	
	
	public List<Promotion> selectAll(){
		return jdbc.query(SELECT_PROMOTION, rowMapper);
	}

}
