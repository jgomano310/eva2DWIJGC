package dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//interfaz que define los campos de la tabla eva_tch_notas_evaluación
@Entity
@Table(name="eva_tch_notas_evaluación", schema="sc_evaluacion")
public class Eva_tch_notas_evaluación {

	
	public Eva_tch_notas_evaluación() {
		super();
	}

	public Eva_tch_notas_evaluación(String md_uuid, Date md_fch, int id_nota_evaluacion, String cod_alumno,
			int nota_evaluacion, String cod_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_nota_evaluacion = id_nota_evaluacion;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}

	@Column(name="md_uuid")
	String md_uuid;
	@Column(name="md_fch")
	Date md_fch;
	
	@Id
	@Column(name="id_nota_evaluacion", unique=true, nullable=false)
	int id_nota_evaluacion;
	
	@Column(name="cod_alumno")
	String cod_alumno;
	
	@Column(name="nota_evaluacion")
	int nota_evaluacion;
	
	@Column(name="cod_evaluacion")
	String cod_evaluacion;
	
	
	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Date getMd_fch() {
		return md_fch;
	}

	public void setMd_fch(Date md_fch) {
		this.md_fch = md_fch;
	}

	public int getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}

	public void setId_nota_evaluacion(int id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
	}

	public String getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public int getNota_evaluacion() {
		return nota_evaluacion;
	}

	public void setNota_evaluacion(int nota_evaluacion) {
		this.nota_evaluacion = nota_evaluacion;
	}

	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	@Override
	public String toString() {
		return "Eva_tch_notas_evaluación [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_nota_evaluacion="
				+ id_nota_evaluacion + ", cod_alumno=" + cod_alumno + ", nota_evaluacion=" + nota_evaluacion
				+ ", cod_evaluacion=" + cod_evaluacion + "]";
	}

	
	
}
