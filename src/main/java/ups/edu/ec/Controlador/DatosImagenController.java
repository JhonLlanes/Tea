package ups.edu.ec.Controlador;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ups.edu.ec.Bussines.ImagenesFavoritoBussines;
import ups.edu.ec.Modelo.ImagenesFavorito;

@ManagedBean
@ViewScoped
public class DatosImagenController {
	 @Inject
	 private ImagenesFavoritoBussines favbussines;
	 
	 private List<ImagenesFavorito> datosjuego;
	 
	 @PostConstruct
		public void init() {
	    	datosjuego =  favbussines.listarImagen();    	
	    }

	public List<ImagenesFavorito> getDatosjuego() {
		return datosjuego;
	}

	public void setDatosjuego(List<ImagenesFavorito> datosjuego) {
		this.datosjuego = datosjuego;
	}
	 
	 

}
