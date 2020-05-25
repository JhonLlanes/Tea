package ups.edu.ec.Controlador;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ups.edu.ec.Bussines.DatosJuegoBussines;
import ups.edu.ec.Modelo.DatosJuego;


@ManagedBean
@ViewScoped
public class DatosJuegoController{
	
    private int number;
    
    @Inject
    private DatosJuegoBussines djbussines;
    
    private List<DatosJuego> datosjuego;
    
    @PostConstruct
	public void init() {
    	datosjuego =  djbussines.listar();    	
    }
    
    public int getNumber() {
        return number;
    }
 
    public void increment() {
        number++;
    }

	public List<DatosJuego> getDatosjuego() {
		return datosjuego;
	}

	public void setDatosjuego(List<DatosJuego> datosjuego) {
		this.datosjuego = datosjuego;
	}
    

}
