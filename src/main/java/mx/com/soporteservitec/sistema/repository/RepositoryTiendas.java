package mx.com.soporteservitec.sistema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.soporteservitec.sistema.model.Tiendas;

public interface RepositoryTiendas extends JpaRepository<Tiendas, Integer>{
	List<Tiendas> findByNombre(String nombre);

}
