package ups.edu.ec.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.Modelo.Categorias;

@Stateless
public class CategoriaDao {
	
	@Inject
    private EntityManager em;
	
	public List<Categorias> BuscarCategoria(String nombre){
		
		String jpql = "SELECT t FROM Categorias t WHERE t.categoria=:un";
		Query query = em.createQuery(jpql,Categorias.class);
		query.setParameter("un", nombre);
		List<Categorias> listaCate = query.getResultList();
		return listaCate;	
	}

}
