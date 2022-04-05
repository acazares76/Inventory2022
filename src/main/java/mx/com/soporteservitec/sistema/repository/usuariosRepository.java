package mx.com.soporteservitec.sistema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.soporteservitec.sistema.model.usuarios;

public interface usuariosRepository extends JpaRepository<usuarios, Long> {
	List<usuarios> findByNombre(String nombre);
}
