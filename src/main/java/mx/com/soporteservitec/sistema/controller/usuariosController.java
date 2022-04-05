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

import mx.com.soporteservitec.sistema.model.usuarios;
import mx.com.soporteservitec.sistema.repository.usuariosRepository;

@RestController
@RequestMapping("/api")
public class usuariosController {
	@Autowired
	usuariosRepository repoUsuarios;
	@GetMapping("/usuarios")
	public ResponseEntity<List<usuarios>> getAllUsuarios(@RequestParam(required=false) String nombre) {
		try {
			List<usuarios> usuario = new ArrayList<usuarios>();
			if(nombre == null)
				repoUsuarios.findAll().forEach(usuario::add);
			else
				repoUsuarios.findByNombre(nombre).forEach(usuario::add);
			if(usuario.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(usuario,HttpStatus.OK);
							
		}catch (Exception e)  {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}























