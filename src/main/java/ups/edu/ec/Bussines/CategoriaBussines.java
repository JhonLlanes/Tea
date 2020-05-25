package ups.edu.ec.Bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.Dao.CategoriaDao;
import ups.edu.ec.Modelo.Categorias;


@Stateless
public class CategoriaBussines {

	@Inject
	private CategoriaDao cdao;
	
	public List<Categorias> buscarCategoria(String codigo) {

		return cdao.BuscarCategoria(codigo);	

	}
}
