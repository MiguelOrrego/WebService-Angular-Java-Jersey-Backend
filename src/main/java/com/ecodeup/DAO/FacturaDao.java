package com.ecodeup.DAO;
import java.util.List;
import javax.persistence.EntityManager;
import com.ecodeup.model.Factura;
import com.ecodeup.model.JPAUtil;


public class FacturaDao {

	
EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	public void guardar(Factura factura) {
		entity.getTransaction().begin();
		entity.persist(factura);
		entity.getTransaction().commit();
	}
	
	public List<Factura> obtenerFacturas(String documento){
		
		
		String consulta="SELECT f.factnumero,f.facfechaemision,f.facvalor,p.pernombre,p.perapellido,l.percedula,l.linumerolinea FROM Factura f JOIN Linea l ON f.linumerolineas=l.linumerolinea JOIN Persona p ON l.percedula=p.percedula WHERE l.percedula= (:documento)";
		@SuppressWarnings("unchecked")
		List<Factura>listaPersonas=(List<Factura>) entity.createQuery(consulta)
													.setParameter("documento", documento.toString())
													.getResultList();
	
		
		return listaPersonas;
	}
	
	public void eliminarFactura(int id){
		Factura f = new Factura();
		f=entity.find(Factura.class,id);
		entity.getTransaction().begin();
		entity.remove(f);
		entity.getTransaction().commit();

	}
	
	
	
}

