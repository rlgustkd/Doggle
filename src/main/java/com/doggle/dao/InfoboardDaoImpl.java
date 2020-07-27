package com.doggle.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.InfoboardVO;

@Repository
public class InfoboardDaoImpl implements InfoboardDao {

	@Inject
	private SqlSession sql;

	// 주회#2
	@Override
	public InfoboardVO read(int p_no) throws Exception {
		return sql.selectOne("infoboardMapper.read", p_no);
	}

	// 목록
	@Override
	public List<InfoboardVO> list(int b_no) throws Exception {
		return sql.selectList("infoboardMapper.list", b_no);
	}

	@Override
	public void insertClobTable(Map<String, String> reqMap) {
		sql.insert("infoboardMapper.insertClobTable", reqMap);
	}

	@Override
	public int delete(InfoboardVO infoboardVO) throws Exception {
		sql.update("infoboardMapper.delete", infoboardVO);
		return 0;
	}

}