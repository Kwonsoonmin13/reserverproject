package kr.or.connect.reserverproject.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reserverproject.dto.Count;
import static kr.or.connect.reserverproject.dao.ReserverSql.*;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Count_GetDao {
	NamedParameterJdbcTemplate jdbc;
	RowMapper<Count> rowMapper = BeanPropertyRowMapper.newInstance(Count.class);	
	
	public Count_GetDao(DataSource dataSource) {
		this.jdbc=new NamedParameterJdbcTemplate(dataSource);
	}
	
	public String count_Total() {
		String total = "";
		List<Count> count=new ArrayList<Count>();
		count=jdbc.query(CATEGORY_COUNT, rowMapper);
		total=String.valueOf(count.get(0).getCount());
		
		return total;
	}

}
