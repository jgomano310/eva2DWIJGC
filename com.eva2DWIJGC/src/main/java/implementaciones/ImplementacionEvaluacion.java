package implementaciones;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.Eva_cat_evaluacion;
import dao.Eva_tch_notas_evaluación;
import dao.InterfazIMPLCatalogo;
import dao.InterfazIMPLEvaluacion;

@Component
public class ImplementacionEvaluacion {

	
	@Autowired
	private InterfazIMPLEvaluacion e;
	
	
	//metodo que inserta en la tabla  Eva_tch_notas_evaluación
	@Transactional
	public void insertar(Eva_tch_notas_evaluación evaluacion) {
	e.Insertar(evaluacion);
	}
	
	@Transactional
	//metodo que inserta  una lista en la tabla  Eva_tch_notas_evaluación

	public void insertarListaEvaluacion(Collection<Eva_tch_notas_evaluación> coleccionevaluacion) {
		for (Eva_tch_notas_evaluación evaluacion : coleccionevaluacion) {
			e.Insertar(evaluacion);
		}
	}
	
	//metodo que muestra valores de la tabla  Eva_tch_notas_evaluación
	@Transactional
	public List<Eva_tch_notas_evaluación> TodasEvaluaciones() {
		return e.listarEvaluacion();
	}
}
