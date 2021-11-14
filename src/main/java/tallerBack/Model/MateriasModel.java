package tallerBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Materias")
public class MateriasModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
	@Column(name="cantidad_horas")
	@Min(value=1, message="cantidad de horas debe ser mayor o igual a 1")
	private int cantidad_horas;
	
	@NotNull(message = "Cuatrimestre es obligatorio")
	@Min(value=1, message="cuatrimestre debe ser mayor o igual a 1")
	@Max(value=10, message="cuatrimestre debe ser menor o igual a 10")
	@Column(name="cuatrimestre")
	private int cuatrimestre;
	
	@Column(name="nombre")
	@Pattern(regexp="[a-zA-Z]{1,10}",message="Nombre debe iniciar con Letra. Minimo tres Caracteres. Maximo 10")  
	@NotEmpty(message = "Nombre es obligatorio")
	private String nombre;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad_horas() {
		return cantidad_horas;
	}

	public void setCantidad_horas(int cantidad_horas) {
		this.cantidad_horas = cantidad_horas;
	}

	public int getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}