package com.rodrigojose.desafioRodrigo.dto;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class UsuarioNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull()
	private String name;

	@NotNull()
	private String email;

	@NotNull()
	private String password;

	@NotNull()
	private String ddd;

	@NotNull()
	private String number;

	public UsuarioNewDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
