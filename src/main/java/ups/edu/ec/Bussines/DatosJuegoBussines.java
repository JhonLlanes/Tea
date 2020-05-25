package ups.edu.ec.Bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.Dao.DatosJuegoDao;
import ups.edu.ec.Modelo.DatosJuego;

@Stateless
public class DatosJuegoBussines {
	
	@Inject
	private DatosJuegoDao datosJuegoDao;
	
	public void guardar(DatosJuego datosJuego) {
		datosJuegoDao.insert(datosJuego);
	}
	
	public List<DatosJuego> listar() {
		return datosJuegoDao.listar();
	}
	

}
