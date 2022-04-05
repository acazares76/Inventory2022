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

import mx.com.soporteservitec.sistema.model.proveedores;
import mx.com.soporteservitec.sistema.repository.proveedoresRepository;

@RestController
@RequestMapping("/api")
public class proveedoresController {
	@Autowired
	proveedoresRepository repoProveedores;
	@GetMapping("/proveedores")
	public ResponseEntity<List<proveedores>> getAllProveedores(@RequestParam(required=false) String nombre) {
		try {
			List<proveedores> proveedor = new ArrayList<proveedores>();
			if(nombre == null)
				repoProveedores.findAll().forEach(proveedor::add);
			else
				repoProveedores.findByNombre(nombre).forEach(proveedor::add);
			if(proveedor.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(proveedor,HttpStatus.OK);
						
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
