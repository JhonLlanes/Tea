package ups.edu.ec.Dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

import ups.edu.ec.Modelo.Persona;

@Stateless
public class PersonaDao {

	@Inject
    private EntityManager em;

	/**
	 * Para insertar a las personas
	 * 
	 * @param persona
	 */
	public void insert(Persona persona) {
		em.persist(persona);
	}
	
	public Persona read(int id) {
		Persona aux = em.find(Persona.class, id);
		return aux;
	}
	/***
	 * Lista a todas las personas
	 * @return
	 */
	public List<Persona> listarPersona(){
		String jpql = "SELECT t FROM Persona t";
		Query query = em.createQuery(jpql,Persona.class);
		List<Persona> totalPersonas = query.getResultList();
		return totalPersonas;	
	}
	
	/*
	 * {
    "categoriaA":"perro",
    "categoriaB":"perro",
    "categoriaC":"juan",
    "codigo":2,
    "porcentajeA":1,
    "porcentajeB":1,
    "porcentajeC":1
		}
	 */
	
	/***
	 * 
	 * @param codigo de la persona que va a ser asignado 
	 * @return
	 */
	
	public List<Persona> BuscarId(int codigo){
		String jpql = "SELECT t FROM Persona t WHERE t.codigo=:un";
		Query query = em.createQuery(jpql,Persona.class);
		query.setParameter("un", codigo);
		List<Persona> totalPersonas = query.getResultList();
		return totalPersonas;	
	}
	

}
