package com.rodrigojose.desafioRodrigo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigojose.desafioRodrigo.domain.Usuario;
import com.rodrigojose.desafioRodrigo.repositories.UsuarioRepository;

@SpringBootApplication
public class DesafioRodrigoApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	public static void main(String[] args) {
		SpringApplication.run(DesafioRodrigoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Usuario user1 = new Usuario (null, "Rodrigo","rodrigo@gmail.com",2225);
		Usuario user2 = new Usuario (null, "Ryan","ryan@gmail.com",2522);		
		
		
		
		
		usuarioRepository.saveAll(Arrays.asList(user1, user2));
		
	}

}
