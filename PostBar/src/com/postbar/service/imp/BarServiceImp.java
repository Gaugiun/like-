package com.postbar.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.postbar.dao.BarDao;
import com.postbar.dao.entities.Bar;
import com.postbar.service.BarService;

@Service
public class BarServiceImp implements BarService {
	@Autowired
	private BarDao barDao;
	
	@Transactional(readOnly=true)
	@Override
	public List<Bar> getAllBar() {
		return this.barDao.getAllBar();
	}
	@Transactional(readOnly=true)
	@Override
	public List<Bar> getBarByName(String name) {
		return this.barDao.getBarByName(name);
	}
	@Override
	public Bar getBarByBarId(Integer barId) {
		return this.barDao.getBarByBarId(barId);
	}

}
