package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class productos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="codigo")
	private String codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precioalpublico")
	private String precioalpublico;
	@Column(name="existencia")
	private String existencia;
	@Column(name="precio")
	private String precio;
	@Column(name="unidad")
	private String unidad;
	@Column(name="imagen")
	private String imagen;
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
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getPrecioalpublico() {
			return precioalpublico;
		}
		public void setPrecioalpublico(String precioalpublico) {
			this.precioalpublico = precioalpublico;
		}
		public String getExistencia() {
			return existencia;
		}
		public void setExistencia(String existencia) {
			this.existencia = existencia;
		}
		public String getPrecio() {
			return precio;
		}
		public void setPrecio(String precio) {
			this.precio = precio;
		}
		public String getUnidad() {
			return unidad;
		}
		public void setUnidad(String unidad) {
			this.unidad = unidad;
		}
		public String getImagen() {
			return imagen;
		}
		public void setImagen(String imagen) {
			this.imagen = imagen;
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
		
		public productos(String codigo, String nombre, String descripcion, String precioalpublico, String existencia,
				String precio, String unidad, String imagen, String fecharegistro, Boolean status, int idtienda) {
			
			this.codigo = codigo;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.precioalpublico = precioalpublico;
			this.existencia = existencia;
			this.precio = precio;
			this.unidad = unidad;
			this.imagen = imagen;
			this.fecharegistro = fecharegistro;
			this.status = status;
			this.idtienda = idtienda;
		}
		public productos() {
			
		}
		
		

}
