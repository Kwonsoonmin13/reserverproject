package kr.or.connect.reserverproject.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reserverproject.dto.Category;
import static kr.or.connect.reserverproject.dao.ReserverSql.*;

@Repository
public class CategoryDao {

	NamedParameterJdbcTemplate jdbc;
	RowMapper<Category> rowMapper = BeanPropertyRowMapper.newInstance(Category.class);
	
	public CategoryDao(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Category> Select_Category(){
		List<Category>input_list = new ArrayList<Category>();
		List<String> categoryList = new ArrayList<String>();
		
		input_list=jdbc.query(SELECT_CATEGORY, rowMapper);
		/*for(int i=0;i<input_list.size();i++) {
			categoryList.add(input_list.get(i).getName());
		}*/
		return input_list;
	}
	
}
