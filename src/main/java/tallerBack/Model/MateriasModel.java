package tallerBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Materias")
public class MateriasModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
	@Column(name="cantidad_horas")
	private int cantidad_horas;
	
	@Column(name="cuatrimestre")
	private int cuatrimestre;
	
	@Column(name="nombre")
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