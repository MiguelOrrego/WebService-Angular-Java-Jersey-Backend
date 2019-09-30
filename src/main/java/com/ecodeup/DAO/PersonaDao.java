package com.ecodeup.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecodeup.model.JPAUtil;
import com.ecodeup.model.Persona;

public class PersonaDao {

EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	public void guardar(Persona persona) {
		
		entity.getTransaction().begin();
		entity.persist(persona);
		entity.getTransaction().commit();
		
		
	}
	
public List<Persona> obtenerPersonas(){
		
		List<Persona> listadoPersonas= new ArrayList<>();
		Query q=entity.createQuery("SELECT p FROM Persona p");
		listadoPersonas=q.getResultList();
		return listadoPersonas;
	}

public Persona buscarPersona(String doc){
	
	Persona p = new Persona();
	p=entity.find(Persona.class, doc);
	return p;
}
}
