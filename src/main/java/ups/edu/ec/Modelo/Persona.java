package ups.edu.ec.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "tbl_persona" , uniqueConstraints = { @UniqueConstraint(columnNames = "codigo") })
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	
	@NotNull
	private int codigo;
	
	private String categoriaA;
	private String categoriaB;
	private String categoriaC;
	
	private String porcentajeA;
	private String porcentajeB;
	private String porcentajeC;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCategoriaA() {
		return categoriaA;
	}

	public void setCategoriaA(String categoriaA) {
		this.categoriaA = categoriaA;
	}

	public String getCategoriaB() {
		return categoriaB;
	}

	public void setCategoriaB(String categoriaB) {
		this.categoriaB = categoriaB;
	}

	public String getCategoriaC() {
		return categoriaC;
	}

	public void setCategoriaC(String categoriaC) {
		this.categoriaC = categoriaC;
	}

	public String getPorcentajeA() {
		return porcentajeA;
	}

	public void setPorcentajeA(String porcentajeA) {
		this.porcentajeA = porcentajeA;
	}

	public String getPorcentajeB() {
		return porcentajeB;
	}

	public void setPorcentajeB(String porcentajeB) {
		this.porcentajeB = porcentajeB;
	}

	public String getPorcentajeC() {
		return porcentajeC;
	}

	public void setPorcentajeC(String porcentajeC) {
		this.porcentajeC = porcentajeC;
	}



}
