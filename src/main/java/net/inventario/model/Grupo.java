package net.inventario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Grupos")
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String codigo;
	private String descripcion;
	@OneToOne
	@JoinColumn(name = "idCentroCosto")
	private CentroCosto centroCosto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public CentroCosto getCentroCosto() {
		return centroCosto;
	}
	public void setCentroCosto(CentroCosto centroCosto) {
		this.centroCosto = centroCosto;
	}
	
	

}
