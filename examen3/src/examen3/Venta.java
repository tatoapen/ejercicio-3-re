package examen3;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the venta database table.
 * 
 */
@Entity
@Table(name="venta")
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	

	private int catidad;


	
	
	private int materia;

	
	private int producto;

	

	public Venta() {
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


	public int getProducto() {
		return this.producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}


	
}