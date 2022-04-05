package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class proveedores {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="RFC")
	private String RFC;
	@Column(name="nombre")
	private String nombre;
	@Column(name="numerocuenta")
	private int numerocuenta;
	@Column(name="telefono")
	private String telefono;
	@Column(name="direccion")
	private String direccion;
	@Column(name="email")
	private String email;
	@Column(name="banco")
	private String banco;
	@Column(name="clabeinterbancaria")
	private String clabeinterbancaria;
	@Column(name="fecharegistro")
	private String fecharegistro;
	@Column(name="status")
	private Boolean status;
	@Column(name="idtienda")
	private int idtienda;
	public int getIdtienda() {
		return idtienda;
	}
	public void setIdtienda(int idtienda) {
		this.idtienda = idtienda;
	}
		public String getRFC() {
		return RFC;
	}
	public void setRFC(String RFC) {
		this.nombre = RFC;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumerocuenta() {
		return numerocuenta;
	}
	public void setNumerocuenta(int numerocuenta) {
		this.numerocuenta = numerocuenta;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getClabeinterbancaria() {
		return clabeinterbancaria;
	}
	public void setClabeinterbancaria(String clabeinterbancaria) {
		this.clabeinterbancaria = clabeinterbancaria;
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
	
	public proveedores(String RFC, String nombre, int numerocuenta, String telefono, String direccion, String email,
			String banco, String clabeinterbancaria, String fecharegistro, Boolean status, int idtienda) {
		
		this.RFC = RFC;
		this.nombre = nombre;
		this.numerocuenta = numerocuenta;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.banco = banco;
		this.clabeinterbancaria = clabeinterbancaria;
		this.fecharegistro = fecharegistro;
		this.status = status;
		this.idtienda = idtienda;
	}
	public proveedores() {
		
	}
	
	
}