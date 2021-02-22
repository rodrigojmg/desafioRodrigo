package com.rodrigojose.desafioRodrigo.resources;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigojose.desafioRodrigo.domain.Usuario;
import com.rodrigojose.desafioRodrigo.dto.UsuarioNewDTO;
import com.rodrigojose.desafioRodrigo.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResources {

	@Autowired
	private UsuarioService userService;

	/*
	 * Nesta parte estou definindo a minha request,
	 * exemplo(https://blog.mbeck.com.br/api-rest-e-os-verbos-http-46e189085e21)
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable UUID id) {
		Optional<Usuario> obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Usuario> save(@RequestBody UsuarioNewDTO objDto) {
		Usuario obj = userService.fromDTO(objDto);
		obj = userService.insert(obj);
		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}

}