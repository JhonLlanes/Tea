package ups.edu.ec.Servicio;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ups.edu.ec.Bussines.PersonaBussines;
import ups.edu.ec.Modelo.Persona;

@Path("/persona")
public class PersonaServicio {

	@Inject
	private PersonaBussines pB;

	@POST
	@Path("/guardar")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta insertar(Persona persona) {
		System.out.println("Guardar Persona");
		Respuesta res = new Respuesta();
		try {
			pB.guardar(persona);
			res.setCodigo(1);
			res.setMensaje("Registro Satisfactorio");
			
		} catch (Exception e) {
			// TODO: handle exception
			res.setCodigo(-1);
			res.setMensaje("Error de registro");
		}
		
		return res;
	}
	
	
	@GET
	@Path("/ListarTodos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> loggina() {
		
			System.out.println("Listar wb");
			List<Persona> listarT= pB.listartodos();
			return 	listarT;	
		
	}
	@GET
	@Path("/BuscarCodigo")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> BuscarId(@QueryParam("codigo") int codigo) {
			System.out.println("Listar wb");
			List<Persona> listarT= pB.BuscarId(codigo);
			return 	listarT;	
		
	}
}
