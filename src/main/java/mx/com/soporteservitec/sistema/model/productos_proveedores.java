 package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos_proveedores")
public class productos_proveedores {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="status")
	private Boolean status;
	@Column(name="fecharegistro")
	private String fecharegistro;
	@Column(name="idproveedores")
	private int idproveedores;
	@Column(name="idproductos")
	private int idproductos;
	public int getIdproductos() {
		return idproductos;
	}
	public void setIdproductos(int idproductos) {
		this.idproductos = idproductos;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(String fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public int getIdproveedores() {
		return idproveedores;
	}
	public void setIdproveedores(int idproveedores) {
		this.idproveedores = idproveedores;
	}
	
	public productos_proveedores(int cantidad, Boolean status, String fecharegistro, int idproveedores,
			int idproductos) {
		
		this.cantidad = cantidad;
		this.status = status;
		this.fecharegistro = fecharegistro;
		this.idproveedores = idproveedores;
		this.idproductos = idproductos;
	}
	public productos_proveedores() {
		
	}
	
	
	
	
	
}
