package ups.edu.ec.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.Modelo.DatosJuego;

@Stateless
public class DatosJuegoDao {
	
	@Inject
    private EntityManager em;
	
	public void insert(DatosJuego datosJuego) {
		em.persist(datosJuego);	
	}
	
	public List<DatosJuego> listar() {
		
		String jpql = "SELECT t FROM DatosJuego t ORDER BY t.id DESC";
		Query query = em.createQuery(jpql, DatosJuego.class);
		List<DatosJuego> djuegos = query.getResultList();
		return djuegos;	
	}

}
