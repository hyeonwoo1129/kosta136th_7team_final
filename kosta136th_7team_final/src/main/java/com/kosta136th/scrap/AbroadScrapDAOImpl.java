package com.kosta136th.scrap;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class AbroadScrapDAOImpl implements AbroadScrapDAO{

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.kosta136th.mapper.NewsMapper";
	
	@Override
	public void addAbroadScrap(AbroadScrap vo) throws Exception {
		
		session.insert(namespace + ".insertAbroadNews", vo);
		
	}

	@Override
	public List<AbroadPopular> popularNews() throws Exception{
		
		return session.selectList(namespace + ".searchAbroadNews");
	}

}
