package com.mum.waa.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDataImpl implements DataRepository{

	@Autowired
	private Database database;

	public String findPassword(String name) {
		// TODO Auto-generated method stub
		return database.getPassword(name);
	}

	public List<String> getAdvices(String roast) {
		// TODO Auto-generated method stub
		return database.getAdvice(roast);
	}
	
	
	
}
