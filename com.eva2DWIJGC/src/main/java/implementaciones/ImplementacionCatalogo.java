package implementaciones;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.Eva_cat_evaluacion;
import dao.InterfazIMPLCatalogo;

@Component
public class ImplementacionCatalogo {

	@Autowired
	private InterfazIMPLCatalogo c;
	
	@Transactional
	
	//metodo que inserta en la tabla  Eva_cat_evaluacion
	public void insertarCatalogo(Eva_cat_evaluacion catalogo) {
	c.Insertar(catalogo);
	}
	
	@Transactional
	//metodo que inserta una lista en la tabla  Eva_cat_evaluacion
	public void insertarListaPedidos(Collection<Eva_cat_evaluacion> coleccionCatalogos) {
		for (Eva_cat_evaluacion catalogo : coleccionCatalogos) {
			c.Insertar(catalogo);
		}
	}
	
	@Transactional
	//metodo que muestra los valores  de la tabla  Eva_cat_evaluacion
	public List<Eva_cat_evaluacion> TodosCatalogos() {
		return c.listarCatalogo();
	}
	
}
