package mx.com.soporteservitec.sistema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.soporteservitec.sistema.model.clientes;

public interface clientesRepository extends JpaRepository<clientes, Long>{
	List<clientes> findByNombre(String nombre);
}
