package com.packt.webstore.service.impl;

import java.util.List;

import com.packt.webstore.domain.UserCredentials;

public interface UserCredentialsService {
	public void save(UserCredentials userCredentials);

	public void update(UserCredentials userCredentials);

	public List<UserCredentials> findAll();

	public UserCredentials findOne(String id);

	public UserCredentials findByUsername(String userName);
}
