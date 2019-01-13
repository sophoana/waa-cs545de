package com.packt.webstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.packt.webstore.domain.UserCredentials;

public interface UserCredentialsRepository extends CrudRepository<UserCredentials, String> {
	public UserCredentials findByUsername(String username);
}
