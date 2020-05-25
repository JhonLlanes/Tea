package ups.edu.ec.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.Modelo.ImagenesFavorito;
import ups.edu.ec.Modelo.Persona;

@Stateless
public class ImagenesFavoritoDao {
	
	@Inject
    private EntityManager em;
	
	public void insert(ImagenesFavorito listFavorito) {
		em.persist(listFavorito);
	}
	
	public List<ImagenesFavorito> listarImagen() {
		String jpql = "SELECT t FROM ImagenesFavorito t ORDER BY t.id DESC";
		Query query = em.createQuery(jpql, ImagenesFavorito.class);
		List<ImagenesFavorito> totalFavoritos = query.getResultList();
		return totalFavoritos;
	}

}
