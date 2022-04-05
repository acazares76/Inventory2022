package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class clientes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="RFC")
	private String RFC;
	@Column(name="nombre")
	private String nombre;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="email")
	private String email;
	@Column(name="fecharegistro")
	private String fecharegistro;
	@Column(name="celular")
	private String celular;
	@Column(name="imagen")
	private String imagen;
	@Column(name="status")
	private Boolean status;
	@Column(name="idtienda")
	private int idtienda;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(String fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public int getIdtienda() {
		return idtienda;
	}
	public void setIdtienda(int idtienda) {
		this.idtienda = idtienda;
	}
	public clientes(String RFC, String nombre, String direccion, String telefono, String email, String fecharegistro,
			String celular, String imagen, Boolean status, int idtienda) {
		
		this.RFC = RFC;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fecharegistro = fecharegistro;
		this.celular = celular;
		this.imagen = imagen;
		this.status = status;
		this.idtienda = idtienda;
	}
	public clientes() {
		
	}
	
	
	
}
