package mx.com.soporteservitec.sistema.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.soporteservitec.sistema.model.ingresos;


public interface ingresosRepository extends JpaRepository<ingresos, Long>{	

	List<ingresos> findByCantidad(int cantidad);
}
