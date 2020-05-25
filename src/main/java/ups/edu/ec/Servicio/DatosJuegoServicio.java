package ups.edu.ec.Servicio;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ups.edu.ec.Bussines.DatosJuegoBussines;
import ups.edu.ec.Modelo.DatosJuego;

@Path("/DatosJuego")
public class DatosJuegoServicio {
	
	@Inject
	private DatosJuegoBussines datosJuegoBussines;
	
	@POST
	@Path("/GuardarDatosJuego")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta insertar(DatosJuego datosJuego) {
		System.out.println("Guardar Persona");
		Respuesta res = new Respuesta();
		
		try {
			datosJuegoBussines.guardar(datosJuego);
			res.setCodigo(1);
			res.setMensaje("Exito");
			
		} catch (Exception e) {
			// TODO: handle exception
			res.setCodigo(-1);
			res.setMensaje("FALLO");
		}
		
		return res;
		
	}
	

}
