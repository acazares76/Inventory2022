package mx.com.soporteservitec.sistema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.soporteservitec.sistema.model.productos;

public interface productosRepository extends JpaRepository<productos, Long> {
	List<productos> findByCodigo(String codigo);
}
