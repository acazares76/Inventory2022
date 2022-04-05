package mx.com.soporteservitec.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.soporteservitec.sistema.model.productos_proveedores;
import mx.com.soporteservitec.sistema.repository.productos_proveedoresRepository;

@RestController
@RequestMapping("/api")
public class productos_proveedoresController {
	@Autowired
	productos_proveedoresRepository repoProductos_proveedores;
	@GetMapping("/productos_proveedores")
	
	public ResponseEntity<List<productos_proveedores>> getAllProductos_proveedores(@RequestParam(required = false) int cantidad){
		try {
			List<productos_proveedores> productos_proveedores = new ArrayList<productos_proveedores>();
			if(cantidad == null)
				repoProductos_proveedores.findAll().forEach(productos_proveedores::add);
			else
				repoProductos_proveedores.findByCantidad(cantidad).forEach(productos_proveedores::add);
			if(productos_proveedores.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(productos_proveedores, HttpStatus.OK);
			
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
