package ups.edu.ec.Servicio;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ups.edu.ec.Bussines.CategoriaBussines;
import ups.edu.ec.Modelo.Categorias;

@Path("/categoria")
public class CategoriaServicio {
	
	@Inject
	private CategoriaBussines cB;
	
	
	@GET
	@Path("/BuscarCategoria")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categorias> BuscarId(@QueryParam("nombre") String codigo) {
			System.out.println("Listar wb");
			List<Categorias> listarCategoria= cB.buscarCategoria(codigo);
			return 	listarCategoria;	
		
	}

}
