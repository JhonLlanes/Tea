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

import ups.edu.ec.Bussines.CategoriaListaBussines;
import ups.edu.ec.Bussines.ImagenesBussines;
import ups.edu.ec.Bussines.ImagenesFavoritoBussines;
import ups.edu.ec.Modelo.CategoriaLista;
import ups.edu.ec.Modelo.ImagenesFavorito;

@Path("/CategoriaLista") 
public class CategoriaListaServicio {
	
	@Inject
	private CategoriaListaBussines ctBussines;
	
	@Inject
	private ImagenesFavoritoBussines imgfav;
	
	@Inject
	private ImagenesBussines imgBussines;
	
	@GET
	@Path("/BuscarCategoriaLista")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CategoriaLista> BuscarId(@QueryParam("nombreA") String noma,@QueryParam("nombreB") String nomb,@QueryParam("nombreC") String nomc) {
		System.out.println("Ingreso al Ws Lista Categorias");
		return ctBussines.BuscarCategorias(noma, nomb, nomc);
	}
	
	@GET
	@Path("/BuscarImagnes")
	@Produces(MediaType.APPLICATION_JSON)
	public String bImagnes(@QueryParam("Imagen") String Nimagen) {
		return imgBussines.buscarImagenes(Nimagen);
		
	}
	
	@POST
	@Path("/insetarFavorito")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta insertarF(ImagenesFavorito imgFavo) {
		System.out.println("Guardar");
		Respuesta res = new Respuesta();
		try {
			imgfav.insertarDatos(imgFavo);
			res.setCodigo(1);
			res.setMensaje("Registro Satisfactorio");
			
		} catch (Exception e) {
			// TODO: handle exception
			res.setCodigo(200);
			res.setMensaje("Error de registro");
		}	
		return res;		
	}
	
	
	
}
