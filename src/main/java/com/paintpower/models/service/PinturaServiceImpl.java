package com.paintpower.models.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paintpower.models.dao.PinturaDao;
import com.paintpower.models.entity.Pintura;

@Service
public class PinturaServiceImpl implements PinturaService{
	
	@Autowired
	private PinturaDao pinturaDao;

	public List<Pintura> findAll() {
		return pinturaDao.findAll();
	}

}
