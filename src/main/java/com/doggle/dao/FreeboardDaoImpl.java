package com.doggle.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.FreeboardVO;

@Repository
public class FreeboardDaoImpl implements FreeboardDao {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace="com.doggle.mappers.freeboardMapper";
	
	@Override
	public void write(FreeboardVO vo) throws Exception {
		sql.insert(namespace+ ".write", vo);
	}
	
		//조회
//	@Override
//	public FreeboardVO read(int p_no) throws Exception {
//		return sql.selectOne(namespace + ".read", p_no);
//	}
	
	// 주회#2
	@Override
	public FreeboardVO read(int p_no) throws Exception {
		return sql.selectOne("freeboardMapper.read", p_no);
	}
	
		//수정
	@Override
	public void update(FreeboardVO vo) throws Exception {
		sql.update(namespace+ ".update", vo);
	}
		//삭제
	@Override
	public void delete(int p_no) throws Exception {
		sql.delete(namespace + ".delete", p_no);
	}
	
		//목록
	@Override
	public List<FreeboardVO> list() throws Exception {
//		return sql.selectList(namespace + ".list");
		return sql.selectList("freeboardMapper.list");
	}
	
	
	
	@Override
	public void upload(FreeboardVO freeboardVO) throws Exception{
		sql.insert("freeboardMapper.upload", freeboardVO);
	}
	
	@Override
	public void insertClobTable(Map<String, String> reqMap) {
		sql.insert("freeboardMapper.insertClobTable", reqMap);
	}
}
