package tech.awakelab.SprintFinalModulo6.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.SprintFinalModulo6.model.bean.Capacitacion;
import tech.awakelab.SprintFinalModulo6.model.dao.CapacitacionDaoImpl;

@Service
public class CapacitacionService {

	
//	private ArrayList<Capacitacion> capacitaciones = new ArrayList<>();	// Se usaba previamente, pero ya no es necesario

	@Autowired
	CapacitacionDaoImpl cDAO;
	
	public CapacitacionService() {
		super();
	}
	
	public List<Capacitacion> getAll() {
		return cDAO.readAll();
	}
	
	public Capacitacion getOne(int id) {
		return cDAO.readOne(id);
	}
	
	public void create(Capacitacion c) {
		cDAO.create(c);
	}
	
	public void update(Capacitacion c) {
		cDAO.update(c);
	}
	
	public void delete(int id) {
		cDAO.delete(id);
	}
}
	
