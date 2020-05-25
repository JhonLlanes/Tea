package ups.edu.ec.Bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.Dao.ImagenesFavoritoDao;
import ups.edu.ec.Modelo.ImagenesFavorito;

@Stateless
public class ImagenesFavoritoBussines {
	
	@Inject
	private ImagenesFavoritoDao ifav;
	
	public void  insertarDatos(ImagenesFavorito ifa) {
		ifav.insert(ifa);
	}
	
	public List<ImagenesFavorito> listarImagen() {
		return ifav.listarImagen();
	}

}
