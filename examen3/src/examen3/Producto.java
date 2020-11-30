package examen3;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@Table(name="producto")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)


	private int catidad;


	private int materia;

	@Column(length=50)
	private String nombre;

	public Producto() {
	}

	public int getCatidad() {
		return this.catidad;
	}

	public void setCatidad(int catidad) {
		this.catidad = catidad;
	}

	public int getMateria() {
		return this.materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}