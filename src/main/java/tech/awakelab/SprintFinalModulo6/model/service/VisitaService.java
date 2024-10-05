package tech.awakelab.SprintFinalModulo6.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.SprintFinalModulo6.model.bean.Visita;
import tech.awakelab.SprintFinalModulo6.model.dao.VisitaDaoImpl;

@Service
public class VisitaService {

	@Autowired
	VisitaDaoImpl vDAO;
	
	public VisitaService() {
		super();
	}
	
	public List<Visita> getAll() {
		return vDAO.readAll();
	}
	
	public Visita getOne(int id) {
		return vDAO.readOne(id);
	}
	
	public void create(Visita v) {
		vDAO.create(v);
	}
	
	public void update(Visita v) {
		vDAO.update(v);
	}
	
	public void delete(int id) {
		vDAO.delete(id);
	}
}
	
