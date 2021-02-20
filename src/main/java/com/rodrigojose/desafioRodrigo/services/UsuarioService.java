package com.rodrigojose.desafioRodrigo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigojose.desafioRodrigo.domain.Usuario;
import com.rodrigojose.desafioRodrigo.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository userRepository;

	public Optional<Usuario> findById(Integer id) {
		return userRepository.findById(id);
	}
}
