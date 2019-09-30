package com.ecodeup.ws.rest.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.DAO.EquipoDao;
import com.ecodeup.DAO.FacturaDao;
import com.ecodeup.DAO.LineaDao;
import com.ecodeup.DAO.PersonaDao;
import com.ecodeup.model.Equipo;
import com.ecodeup.model.Factura;
import com.ecodeup.model.JPAUtil;
import com.ecodeup.model.Linea;
import com.ecodeup.model.Persona;

@Path("/PruebaOrrego")
public class Service {
	
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	public String mensaje="doc";


	@GET
	@Path("/listadoLibros")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public  List<Persona> listadoLibros() {
		PersonaDao personaDao= new PersonaDao();
		return personaDao.obtenerPersonas();
	}
	
	
	@POST
	@Path("/registrarPersona")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void registrarPersona(Persona persona) {
	PersonaDao personaDao= new PersonaDao();
	 personaDao.guardar(persona);
	}
	
	
	@POST
	@Path("/registrarLinea")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void registrarLinea(Linea linea) {
	LineaDao lineaDao= new LineaDao();
	lineaDao.guardar(linea);
	}
	
	
	
	@POST
	@Path("/registrarFactura")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void registrarFactura(Factura factura) {
	FacturaDao facturaDao= new FacturaDao();
	facturaDao.guardar(factura);
	}
	
	
	@GET
	@Path("/obtenerFacturas/{documento}")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public List<Factura> obtenerFacturas(@PathParam("documento") String documento) {
	
	FacturaDao facturaDao= new FacturaDao();
	

	return facturaDao.obtenerFacturas(documento);
	
	}
	
	@GET
	@Path("/buscarPersona/{doc}")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public Persona buscarPersona(@PathParam("doc") String doc) {
		PersonaDao personaDao= new PersonaDao();

		return personaDao.buscarPersona(doc);
	}
	
	@GET
	@Path("/buscarLinea/{linumerolinea}")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public Linea buscarLinea(@PathParam("linumerolinea") int linumerolinea) {
		LineaDao lineaDao= new LineaDao();

		return lineaDao.buscarLinea(linumerolinea);
	}
	
	
	@GET
	@Path("/obtenerLineaEditar/{documento}/{linumerolinea}")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public List<Linea> obtenerLineaEditar(@PathParam("documento") String documento,@PathParam("linumerolinea") int linumerolinea) {
		LineaDao lineaDao= new LineaDao();
		return lineaDao.obtenerLineaEditar(documento,linumerolinea);
	}
	
	
	
	@DELETE
	@Path("/eliminarFactura/{id}")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void eliminarFactura(@PathParam("id") int id) {
		FacturaDao facturaDao= new FacturaDao();
		facturaDao.eliminarFactura(id);
	}
	
	

	@PUT
	@Path("/editarEstadoLinea")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void editarEstadoLinea(Linea l) {
		LineaDao lineaDao= new LineaDao();
		lineaDao.editarEstadoLinea(l);
		
	}
	
	@POST
	@Path("/registrarEquipo")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void registrarEquipo(Equipo equipo) {
	EquipoDao equipoDao= new EquipoDao();
	equipoDao.guardarEquipo(equipo);
	}
	
	
	@GET
	@Path("/buscarEquipo/{equserial}")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public Equipo buscarEquipo(@PathParam("equserial") int equserial) {
		EquipoDao equipoDao= new EquipoDao();

		return equipoDao.buscarEquipo(equserial);
	}
	
	
}
