package com.postbar.service;

import java.util.List;

import com.postbar.dao.entities.Bar;

public interface BarService {

	public List<Bar> getAllBar();
	
	public List<Bar> getBarByName(String name);
	
	public Bar getBarByBarId(Integer barId);
}
