package com.qtl.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by tlqiao on 2/24/16.
 */
public class DBUtil {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List getUserDetails (String userName)
	{ return jdbcTemplate.queryForList(SQLConstant.getUserDetails,new Object[]{userName});}

}
