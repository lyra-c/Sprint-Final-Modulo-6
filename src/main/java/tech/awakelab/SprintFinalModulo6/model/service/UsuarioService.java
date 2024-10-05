package tech.awakelab.SprintFinalModulo6.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.SprintFinalModulo6.model.bean.Usuario;
import tech.awakelab.SprintFinalModulo6.model.dao.UsuarioDaoImpl;

@Service
public class UsuarioService {

	@Autowired
	UsuarioDaoImpl uDAO;
	
	public UsuarioService() {
		super();
	}
	
	public List<Usuario> getAll () {
		return uDAO.readAll();
	}
	
	Usuario getOne(int id) {
		return uDAO.readOne(id);
	}
	
}
