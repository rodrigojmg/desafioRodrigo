package com.rodrigojose.desafioRodrigo.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigojose.desafioRodrigo.domain.Usuario;
import com.rodrigojose.desafioRodrigo.services.UsuarioService;

@RequestMapping(value = "/usuario")
@RestController
public class UsuarioResources {

//	@RequestMapping(method = RequestMethod.GET)
//	public List<Usuario> lista() {
//		Usuario cat1 = new Usuario (1,"Rodrigo","rodrigo@gmail.com",2222);
////		Categoria cat2 = new Categoria (2,"email");
//
//		List<Usuario> lista = new ArrayList<>();
//		lista.add(cat1);
////		lista.add(cat2);
//
//		return lista;
//	}

	@Autowired
	private UsuarioService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET) // Nesta parte estou definindo a minha request,
																	// exemplo(https://blog.mbeck.com.br/api-rest-e-os-verbos-http-46e189085e21)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Optional<Usuario> obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}