package dao;

import java.util.List;
//interfaz que equivale a los metodos insert y select  para Eva_tch_notas_evaluación
public interface InterfazEvaluacion {

	
	public List<Eva_tch_notas_evaluación> listarEvaluacion();
	
	public void Insertar (Eva_tch_notas_evaluación evaluacion);
}
