package mx.com.soporteservitec.sistema.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.soporteservitec.sistema.model.productos_proveedores;

public interface productos_proveedoresRepository extends JpaRepository<productos_proveedores, Long>{
	
	List<productos_proveedores> findByCantidad(int cantidad);
}
