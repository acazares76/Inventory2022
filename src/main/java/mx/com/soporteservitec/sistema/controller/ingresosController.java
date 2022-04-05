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
import mx.com.soporteservitec.sistema.model.ingresos;
import mx.com.soporteservitec.sistema.repository.ingresosRepository;

@RestController
@RequestMapping("/api")
public class ingresosController {
	@Autowired
	ingresosRepository repoingresos;
	@GetMapping("/ingresos")
	
	public ResponseEntity<List<ingresos>> getAllingresos(@RequestParam(required = false) int cantidad){
		try {
			List<ingresos> ingresos = new ArrayList<ingresos>();
			if(cantidad == null)
				repoingresos.findAll().forEach(ingresos::add);
			else
				repoingresos.findByCantidad(cantidad).forEach(ingresos::add);
				if(ingresos.isEmpty()) {
					return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
				}
			return new ResponseEntity<>(ingresos, HttpStatus.OK);
	}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
}
