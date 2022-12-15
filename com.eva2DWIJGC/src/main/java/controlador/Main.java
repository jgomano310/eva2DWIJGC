package controlador;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import dao.Eva_cat_evaluacion;
import dao.Eva_tch_notas_evaluación;
import implementaciones.ImplementacionCatalogo;
import implementaciones.ImplementacionEvaluacion;
@Controller
public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        String date = formatter.format(new Date());
        */
		
		System.out.println("Insert y select de la tabla Eva_cat_evaluacion: ");
		
		
		//inicializo bean
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml"); 
		ImplementacionCatalogo catalogo = (ImplementacionCatalogo) context.getBean(ImplementacionCatalogo.class);
		
		//creo un nuevo catalogo
		catalogo.insertarCatalogo(new Eva_cat_evaluacion("prueba2", "prueba2"));
		System.out.println("Lista catalogos: " + catalogo.TodosCatalogos());
		
		System.out.println("Insert y select de la tabla Eva_tch_notas_evaluación: ");
		
		ImplementacionEvaluacion evaluacion= (ImplementacionEvaluacion) context.getBean(ImplementacionEvaluacion.class);
		//creo un nuevo catalogo
		evaluacion.insertar(new Eva_tch_notas_evaluación("jgc", null, 31, "jgc", 10, "prueba2"));
		
		System.out.println("Lista notas-evaluacion: " + evaluacion.TodasEvaluaciones());
	}

}
