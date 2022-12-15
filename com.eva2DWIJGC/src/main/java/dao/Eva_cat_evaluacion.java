package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//interfaz que define los campos de la tabla eva_cat_evaluacion
@Entity
@Table(name="eva_cat_evaluacion", schema="sc_evaluacion")
public class Eva_cat_evaluacion {

	
	@Id
	@Column(name="cod_evaluacion", unique=true, nullable=false)
	String cod_evaluacion;
	
	@Column(name="desc_evaluacion")
	String desc_evaluacion;

	@Override
	public String toString() {
		return "Eva_cat_evaluacion [cod_evaluacion=" + cod_evaluacion + ", desc_evaluacion=" + desc_evaluacion + "]";
	}

	public Eva_cat_evaluacion(String cod_evaluacion, String desc_evaluacion) {
		super();
		this.cod_evaluacion = cod_evaluacion;
		this.desc_evaluacion = desc_evaluacion;
	}

	public Eva_cat_evaluacion() {
		super();
	}

	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	public String getDesc_evaluacion() {
		return desc_evaluacion;
	}

	public void setDesc_evaluacion(String desc_evaluacion) {
		this.desc_evaluacion = desc_evaluacion;
	}
}
