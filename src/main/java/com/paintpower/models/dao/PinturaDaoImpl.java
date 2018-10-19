package com.paintpower.models.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.paintpower.models.entity.Pintura;

@Repository
public class PinturaDaoImpl implements PinturaDao{

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional //Quan es lectura es pot ficar aquest. Si no es lectura no cal ficar readonly. Només transaccional
	@Override
	public List<Pintura> findAll() {
		return em.createQuery("from Pintura").getResultList();
	}
	
}

