package com.appetizer.subway.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SubwayDao {

	@Autowired
	SqlSession sqlSession;
	
//	public List<Map<String,Object>> selectBoardList(Map<String,String> param) throws Exception{
//		return sqlSession.selectList("board.selectBoardList",param);
//	}
	
}
