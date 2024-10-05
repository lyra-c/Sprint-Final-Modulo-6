package tech.awakelab.SprintFinalModulo6.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.SprintFinalModulo6.model.bean.CrearUsuario;
import tech.awakelab.SprintFinalModulo6.model.dao.CrearUsuarioDaoImpl;

@Service
public class CrearUsuarioService {

	
//	private ArrayList<Capacitacion> capacitaciones = new ArrayList<>();	// Se usaba previamente, pero ya no es necesario

	@Autowired
	CrearUsuarioDaoImpl cDAO;
	
	public CrearUsuarioService() {
		super();
	}
	
	public List<CrearUsuario> getAll() {
		return cDAO.readAll();
	}
	
	public CrearUsuario getOne(int id) {
		return cDAO.readOne(id);
	}
	
	public void create(CrearUsuario c) {
		cDAO.create(c);
	}
	
	public void update(CrearUsuario c) {
		cDAO.update(c);
	}
	
	public void delete(int id) {
		cDAO.delete(id);
	}
}
	
