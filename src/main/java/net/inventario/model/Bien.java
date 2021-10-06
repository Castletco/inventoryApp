package net.inventario.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bienes")
public class Bien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JoinColumn(name = "idGrupo")
	private Grupo grupo;
	@OneToOne
	@JoinColumn(name = "idSubgrupo")
	private SubGrupo subGrupo;
	@OneToOne
	@JoinColumn(name = "idRubro")
	private Rubro rubro;
	@OneToOne
	@JoinColumn(name = "idCentroCosto")
	private CentroCosto centroCosto;
	@OneToOne
	@JoinColumn(name = "idEstado")
	private Estado estado;
	private Integer correlativo;
	private String nombre;
	private Date fecha;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public SubGrupo getSubGrupo() {
		return subGrupo;
	}
	public void setSubGrupo(SubGrupo subGrupo) {
		this.subGrupo = subGrupo;
	}
	public Rubro getRubro() {
		return rubro;
	}
	public void setRubro(Rubro rubro) {
		this.rubro = rubro;
	}
	public CentroCosto getCentroCosto() {
		return centroCosto;
	}
	public void setCentroCosto(CentroCosto centroCosto) {
		this.centroCosto = centroCosto;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Integer getCorrelativo() {
		return correlativo;
	}
	public void setCorrelativo(Integer correlativo) {
		this.correlativo = correlativo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}	
}
