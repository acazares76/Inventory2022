package mx.com.soporteservitec.sistema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.soporteservitec.sistema.model.proveedores;

public interface proveedoresRepository extends JpaRepository<proveedores, Long> {
	List<proveedores> findByNombre(String nombre);
}
