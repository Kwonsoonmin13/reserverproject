package kr.or.connect.reserverproject.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reserverproject.dto.File_info;
import static kr.or.connect.reserverproject.dao.ReserverSql.*;
import kr.or.connect.reserverproject.dao.ReserverSql;
@Repository
public class File_InfoDao {
	NamedParameterJdbcTemplate jdbc;
	RowMapper<File_info> rowMapper = BeanPropertyRowMapper.newInstance(File_info.class);
	
	public File_InfoDao(DataSource dataSource) {
		this.jdbc=new NamedParameterJdbcTemplate(dataSource);
	}
	
	
	
	public List<String> path_Get (List<Integer> file_id){
		List<String> path_li = new ArrayList<String>();
		String sql = SELECT_IMG_PATH +" in (";
		for(int i=0;i<file_id.size();i++) {
			sql += file_id.get(i);
			if(i!=file_id.size()-1) {
				sql+=",";
			}
		}
		sql+=")";
		
		
		
		List<File_info> file_info_li=new ArrayList<File_info>();
		File_info file_info = new File_info();
		file_info_li=jdbc.query(sql, rowMapper);
		
		
		
		
		for(int j=0;j<file_info_li.size();j++) {
			file_info=file_info_li.get(j);
			path_li.add(file_info.getSave_file_name());
		}
		
		
		return path_li;
	}

}
