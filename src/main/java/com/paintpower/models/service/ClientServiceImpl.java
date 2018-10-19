package com.paintpower.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintpower.models.dao.ClientDao;
import com.paintpower.models.entity.Client;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientDao clientDao;

	public List<Client> findAll() {
		return clientDao.findAll();
	}

}
