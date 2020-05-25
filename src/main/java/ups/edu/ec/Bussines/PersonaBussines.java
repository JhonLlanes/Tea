package ups.edu.ec.Bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.Dao.PersonaDao;
import ups.edu.ec.Modelo.Persona;

@Stateless
public class PersonaBussines {

	@Inject
	private PersonaDao pdao;

	public void guardar(Persona persona) {
		pdao.insert(persona);
	}
	public List<Persona> listartodos() {
		return pdao.listarPersona();
	}
	public List<Persona> BuscarId(int codigo) {

		return pdao.BuscarId(codigo);

	}
}
