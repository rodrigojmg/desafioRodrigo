package com.rodrigojose.desafioRodrigo.services;

import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigojose.desafioRodrigo.domain.Phones;
import com.rodrigojose.desafioRodrigo.domain.Usuario;
import com.rodrigojose.desafioRodrigo.dto.UsuarioDTO;
import com.rodrigojose.desafioRodrigo.dto.UsuarioNewDTO;
import com.rodrigojose.desafioRodrigo.repositories.PhonesRepository;
import com.rodrigojose.desafioRodrigo.repositories.UsuarioRepository;
import com.rodrigojose.desafioRodrigo.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository userRepository;

	@Autowired
	private PhonesRepository phonesRepository;

	public Optional<Usuario> findById(UUID id) {
		Optional<Usuario> obj = userRepository.findById(id);

		if (obj.isEmpty()) {
			throw new ObjectNotFoundException("mensagem de erro");
		}

		return userRepository.findById(id);
	}

	@Transactional
	public Usuario insert(Usuario obj) {
		obj.setId(null);
		obj = userRepository.save(obj);
		phonesRepository.saveAll(obj.getPhones());
		return obj;
	}

	public Usuario fromDTO(UsuarioDTO objDto) {
		return new Usuario(objDto.getName(), objDto.getEmail(), objDto.getPassword());
	}

	public Usuario fromDTO(UsuarioNewDTO objDto) {
		Usuario user = new Usuario(objDto.getName(), objDto.getEmail(), objDto.getPassword());
		Phones phones = new Phones(objDto.getNumber(), objDto.getDdd(), user);
		user.getPhones().add(phones);

		return user;
	}
}
