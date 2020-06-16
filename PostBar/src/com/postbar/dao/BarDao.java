package com.postbar.dao;

import java.util.List;

import com.postbar.dao.entities.Bar;

public interface BarDao {
	public List<Bar> getAllBar();
	public List<Bar> getBarByName(String name);
	public Bar getBarByBarId(Integer barId);
}
