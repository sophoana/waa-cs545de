package com.mum.waa.repository;

import java.util.List;

public interface DataRepository {

	public String findPassword(String name);

	public List<String> getAdvices(String roast);
}
