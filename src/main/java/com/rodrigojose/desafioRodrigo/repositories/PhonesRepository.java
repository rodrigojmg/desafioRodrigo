package com.rodrigojose.desafioRodrigo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigojose.desafioRodrigo.domain.Phones;

@Repository
public interface PhonesRepository extends JpaRepository<Phones, String> {

}
