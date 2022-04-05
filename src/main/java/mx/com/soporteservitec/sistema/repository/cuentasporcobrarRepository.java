package mx.com.soporteservitec.sistema.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.soporteservitec.sistema.model.cuentasporcobrar;

public interface cuentasporcobrarRepository extends JpaRepository<cuentasporcobrar, Long>{

	List<cuentasporcobrar> findByDescripcion(String descripcion);
}
