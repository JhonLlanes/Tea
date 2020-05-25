package ups.edu.ec.Dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.Modelo.CategoriaLista;

import java.util.List;

@Stateless
public class CategoriaListaDao {
	
	@Inject
    private EntityManager em;
	
	public List<CategoriaLista> BuscarCategoria(String noma,String nomb,String nomc){
		String jpql = "SELECT t FROM CategoriaLista t WHERE t.nombre=:a OR t.nombre=:b OR t.nombre=:c";	
		Query query = em.createQuery(jpql,CategoriaLista.class);
		query.setParameter("a", noma);
		query.setParameter("b", nomb);
		query.setParameter("c", nomc);
		List<CategoriaLista> ListaCategoria = query.getResultList();
		for (CategoriaLista categoriaLista : ListaCategoria) {
			System.out.print(categoriaLista.getNombre());
		}
		return ListaCategoria;
	}

}
