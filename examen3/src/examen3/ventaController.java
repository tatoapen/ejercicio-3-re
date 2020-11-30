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

public class ventaController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Venta venta;
	
	ventaController(){
		venta = new Venta();
	}
	
	@PersistenceContext(unitName = "examen3")
	private EntityManager em;    

	@Resource
	private UserTransaction userTransaction;

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	public void guardar() throws Exception  {
	    userTransaction.begin();
	    em.persist(venta);
	    userTransaction.commit();
	}

}