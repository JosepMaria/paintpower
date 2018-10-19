package com.paintpower.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.paintpower.models.entity.Client;

@Repository
public class ClientDaoImpl implements ClientDao{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional //Quan es lectura es pot ficar aquest. Si no es lectura no cal ficar readonly. Només transaccional
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Client").getResultList();
	}

}
