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

public class materiaController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Materia materia;
	
	materiaController(){
		materia = new Materia();
	}
	
	@PersistenceContext(unitName = "examen3")
	private EntityManager em;    

	@Resource
	private UserTransaction userTransaction;

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	public void guardar() throws Exception  {
	    userTransaction.begin();
	    em.persist(materia);
	    userTransaction.commit();
	}

}