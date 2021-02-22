package com.rodrigojose.desafioRodrigo.dto;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private String password;

	@NotNull()
	private String ddd;

	@NotNull()
	private String number;

	public UsuarioDTO() {

	}

	public UsuarioDTO(Integer id, String name, String email, String password, String ddd, String number) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.ddd = ddd;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
