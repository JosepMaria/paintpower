package com.paintpower.models.dao;

import java.util.List;

import com.paintpower.models.entity.Client;

public interface ClientDao{
	
	public List<Client> findAll();

}
