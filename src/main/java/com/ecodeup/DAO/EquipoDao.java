package com.ecodeup.DAO;

import javax.persistence.EntityManager;

import com.ecodeup.model.Equipo;
import com.ecodeup.model.JPAUtil;

public class EquipoDao {

	
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	
	public void guardarEquipo(Equipo equipo) {
		
		entity.getTransaction().begin();
		entity.persist(equipo);
		entity.getTransaction().commit();			
	}
	
	public Equipo buscarEquipo(int equserial){
		
		Equipo e = new Equipo();
		e=entity.find(Equipo.class, equserial);
		return e;
	}
}
