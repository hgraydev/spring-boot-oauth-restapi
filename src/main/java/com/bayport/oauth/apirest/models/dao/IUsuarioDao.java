package com.bayport.oauth.apirest.models.dao;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bayport.oauth.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);
	public Usuario findByEmail(String email);

	//@Query("select u from Usuario u where u.email =?1")
	//public Usuario findByEmail2(String username);
}
