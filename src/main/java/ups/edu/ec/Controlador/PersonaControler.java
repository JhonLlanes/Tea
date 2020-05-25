package ups.edu.ec.Controlador;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ups.edu.ec.Bussines.PersonaBussines;
import ups.edu.ec.Modelo.Persona;

@ManagedBean
public class PersonaControler {


	@Inject
	private PersonaBussines pB;
	
	Persona pa = new Persona();
	
	private List <Persona> persona;
	
	@PostConstruct
	public void init() {
		
		//persona = pB.listartodos();
	}
	
	public void Guardar() {
		
		pB.guardar(pa);
		
	}
	
	public void listar() {
		persona = pB.listartodos();
		
	}

	public Persona getPa() {
		return pa;
	}

	public void setPa(Persona pa) {
		this.pa = pa;
	}

	public List<Persona> getPersona() {
		return persona;
	}

	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}
	
	
	
}
