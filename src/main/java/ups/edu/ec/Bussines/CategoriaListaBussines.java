package ups.edu.ec.Bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.Dao.CategoriaListaDao;
import ups.edu.ec.Modelo.CategoriaLista;

@Stateless
public class CategoriaListaBussines {

	@Inject
	private CategoriaListaDao catDao;
	
	public List<CategoriaLista> BuscarCategorias(String noma,String nomb,String nomc) {
		
		return catDao.BuscarCategoria(noma, nomb, nomc);
		
	}
}
