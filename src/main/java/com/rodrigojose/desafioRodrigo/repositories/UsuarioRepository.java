package com.rodrigojose.desafioRodrigo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigojose.desafioRodrigo.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

}
