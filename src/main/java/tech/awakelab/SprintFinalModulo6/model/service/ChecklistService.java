package tech.awakelab.SprintFinalModulo6.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.SprintFinalModulo6.model.bean.Checklist;
import tech.awakelab.SprintFinalModulo6.model.dao.ChecklistDaoImpl;


@Service
public class ChecklistService {

	@Autowired
	ChecklistDaoImpl cDAO;
	
	public ChecklistService() {
		super();
	}
	
	public List<Checklist> getAll() {
		return cDAO.readAll();
	}
	
	public Checklist getOne(int id) {
		return cDAO.readOne(id);
	}
	
	public void create(Checklist checklist) {
		cDAO.create(checklist);
	}
	
	public void update(Checklist checklist) {
		cDAO.update(checklist);
	}
	
	public void delete(int id) {
		cDAO.delete(id);
	}
	
	

	public void update(int id, String estado) {
		// TODO Auto-generated method stub
		
	}
}
	
