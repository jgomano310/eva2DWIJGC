package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

//implementacion de la interfaz "interfaz"
@Component
public class InterfazIMPLCatalogo implements Interfaz {

	
	@PersistenceContext
	EntityManager entity;
	@Override
	public void Insertar(Eva_cat_evaluacion catalogo) {
		entity.persist(catalogo);
		
	}

	@Override
	public List<Eva_cat_evaluacion> listarCatalogo() {
		// TODO Auto-generated method stub
		return  entity.createQuery("SELECT catalogo FROM Eva_cat_evaluacion catalogo").getResultList();
	}

}
