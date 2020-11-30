package examen3;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

@Named
@SessionScoped

public class productoController2 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Producto producto;
	
	productoController2(){
		producto = new Producto();
	}
	
	@PersistenceContext(unitName = "examen3")
	private EntityManager em;    

	@Resource
	private UserTransaction userTransaction;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public void guardar() throws Exception  {
	    userTransaction.begin();
	    em.persist(producto);
	    userTransaction.commit();
	}

}