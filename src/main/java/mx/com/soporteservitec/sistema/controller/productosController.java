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

import mx.com.soporteservitec.sistema.model.productos;
import mx.com.soporteservitec.sistema.repository.productosRepository;

@RestController
@RequestMapping("/api")
public class productosController {
	@Autowired
	productosRepository repoProductos;
	@GetMapping("/productos")	
	public ResponseEntity<List<productos>> getAllProductos(@RequestParam(required=false) String codigo) {
	try {
		List<productos> producto = new ArrayList<productos>();
		if(codigo == null)
			repoProductos.findAll().forEach(producto::add);
		else
			repoProductos.findByCodigo(codigo).forEach(producto::add);
		if(producto.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(producto,HttpStatus.OK);
		
	}catch (Exception e) {
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}











