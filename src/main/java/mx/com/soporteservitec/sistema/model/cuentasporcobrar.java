package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cuentasporcobrar")
public class cuentasporcobrar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="montoabonado")
	private int montoabonado;
	@Column(name="fecharegistro")
	private String fecharegistro;
	@Column(name="status")
	private Boolean status;
	@Column(name="idcliente")
	private int idcliente;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getMontoabonado() {
		return montoabonado;
	}
	public void setMontoabonado(int montoabonado) {
		this.montoabonado = montoabonado;
	}
	public String getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(String fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public cuentasporcobrar(String descripcion, int montoabonado, String fecharegistro, Boolean status, int idcliente) {
	
		this.descripcion = descripcion;
		this.montoabonado = montoabonado;
		this.fecharegistro = fecharegistro;
		this.status = status;
		this.idcliente = idcliente;
	}
	public cuentasporcobrar() {
		
	}
		
	
}
