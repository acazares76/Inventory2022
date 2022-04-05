package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ingresos")
public class ingresos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="precio")
	private int precio;
	@Column(name="fecharegistro")
	private String fecharegistro;
	@Column(name="descuento")
	private String descuento;
	@Column(name="formapago")
	private String formapago;
	@Column(name="numerorecibo")
	private String numerorecibo;
	@Column(name="tipopago")
	private String tipopago;
	@Column(name="tipoentrega")
	private String tipoentrega;
	@Column(name="status")
	private Boolean status;
	@Column(name="idcliente")
	private int idcliente;
	@Column(name="idproducto")
	private int idproducto;
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(String fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public String getFormapago() {
		return formapago;
	}
	public void setFormapago(String formapago) {
		this.formapago = formapago;
	}
	public String getNumerorecibo() {
		return numerorecibo;
	}
	public void setNumerorecibo(String numerorecibo) {
		this.numerorecibo = numerorecibo;
	}
	public String getTipopago() {
		return tipopago;
	}
	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}
	public String getTipoentrega() {
		return tipoentrega;
	}
	public void setTipoentrega(String tipoentrega) {
		this.tipoentrega = tipoentrega;
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
	
	public ingresos(int cantidad, int precio, String fecharegistro, String descuento, String formapago, String numerorecibo,
			String tipopago, String tipoentrega, Boolean status, int idcliente, int idproducto) {
		
		this.cantidad = cantidad;
		this.precio = precio;
		this.fecharegistro = fecharegistro;
		this.descuento = descuento;
		this.formapago = formapago;
		this.numerorecibo = numerorecibo;
		this.tipopago = tipopago;
		this.tipoentrega = tipoentrega;
		this.status = status;
		this.idcliente = idcliente;
		this.idproducto = idproducto;
	}
	public ingresos() {
		
	}
	
		
	
}
