package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;


//implementacion de la interfaz "InterfazEvaluacion"
@Component
public class InterfazIMPLEvaluacion implements InterfazEvaluacion {

	
	@PersistenceContext 
	EntityManager entity;
	@Override
	public List<Eva_tch_notas_evaluación> listarEvaluacion() {
		// TODO Auto-generated method stub
		
		//desc_evaluacion, cod_alumno
		//y nota_evaluacion.
		//return  entity.createQuery("SELECT desc_evaluacion,cod_alumno,nota_evaluacion   FROM Eva_tch_notas_evaluación JOIN eva_cat_evaluacion ON cod_empleado=cod_empleado ").getResultList();
		
		return  entity.createQuery("SELECT evaluacion FROM Eva_tch_notas_evaluación evaluacion").getResultList();
	}

	@Override
	public void Insertar(Eva_tch_notas_evaluación evaluacion) {
		// TODO Auto-generated method stub
		entity.persist(evaluacion);
	}

}
