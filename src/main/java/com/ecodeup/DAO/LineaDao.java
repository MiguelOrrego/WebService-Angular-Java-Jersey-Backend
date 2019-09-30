package com.ecodeup.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import com.ecodeup.model.JPAUtil;
import com.ecodeup.model.Linea;

public class LineaDao {
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();

	public void guardar(Linea linea) {
		
				entity.getTransaction().begin();
				entity.persist(linea);
				entity.getTransaction().commit();			
	}
	
	public Linea buscarLinea(int linumerolinea){
		
		Linea l = new Linea();
		l=entity.find(Linea.class, linumerolinea);
		return l;
	}
	
	public List<Linea> obtenerLineaEditar(String documento,int linumerolinea){
		
		String consulta="SELECT l.linumerolinea,l.linestado,l.tipo_plan,l.percedula,p.pernombre,p.perapellido FROM Linea l JOIN Persona p ON l.percedula=p.percedula WHERE l.percedula= (:documento) AND l.linumerolinea= (:linumerolinea)";
		@SuppressWarnings("unchecked")
		List<Linea>listaLineas=(List<Linea>) entity.createQuery(consulta)
													.setParameter("documento", documento.toString())
													.setParameter("linumerolinea", linumerolinea)
													.getResultList();
		return listaLineas;
	}
	
	public void editarEstadoLinea(Linea linea) {
		
		entity.getTransaction().begin();
		entity.merge(linea);
		entity.getTransaction().commit();
		
	}
	
	
}
