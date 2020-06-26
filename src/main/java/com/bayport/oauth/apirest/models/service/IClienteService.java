package com.bayport.oauth.apirest.models.service;

import java.util.List;

import com.bayport.oauth.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
}
