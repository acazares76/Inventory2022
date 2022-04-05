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

import mx.com.soporteservitec.sistema.model.cuentasporcobrar;
import mx.com.soporteservitec.sistema.repository.cuentasporcobrarRepository;

@RestController
@RequestMapping("/api")
public class cuentasporcobrarController {
	@Autowired
	cuentasporcobrarRepository repcuentasporcobrar;
	@GetMapping("/cuentasporcobrar")
	
	public ResponseEntity<List<cuentasporcobrar>> getAllcuentasporcobrar(@RequestParam(required 
			= false) String descripcion){
		try {
			List<cuentasporcobrar> cuentaporcobrar = new ArrayList<cuentasporcobrar>();
			if(descripcion == null)
				repcuentasporcobrar.findAll().forEach(cuentaporcobrar::add);
			else
				repcuentasporcobrar.findByDescripcion(descripcion).forEach(cuentaporcobrar::add);
				if(cuentaporcobrar.isEmpty()) {
					return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
				}
			return new ResponseEntity<>(cuentaporcobrar, HttpStatus.OK);
	}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}	
}


