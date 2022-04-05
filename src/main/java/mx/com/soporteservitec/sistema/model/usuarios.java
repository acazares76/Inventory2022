package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class usuarios {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="nombre")
	private String nombre;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="celular")
	private String celular;
	@Column(name="email")
	private String email;
	@Column(name="usuario")
	private String usuarios;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuarios;
	}
	public void setUsuario(String usuario) {
		this.usuarios = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	
	public usuarios(String nombre, String direccion, String telefono, String celular, String email, String usuarios,
			String password, String role, String fecharegistro, Boolean status, int idtienda) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.celular = celular;
		this.email = email;
		this.usuarios = usuarios;
		this.password = password;
		this.role = role;
		this.fecharegistro = fecharegistro;
		this.status = status;
		this.idtienda = idtienda;
	}
	public usuarios() {
		
	}
		
}
