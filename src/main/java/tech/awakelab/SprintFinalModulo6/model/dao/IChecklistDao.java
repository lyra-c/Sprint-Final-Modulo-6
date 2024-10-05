package tech.awakelab.SprintFinalModulo6.model.dao;

import java.util.List;

import tech.awakelab.SprintFinalModulo6.model.bean.Checklist;

public interface IChecklistDao {
	void create (Checklist checklist);
	List<Checklist> readAll ();
	Checklist readOne(int id);
	void update (Checklist checklist);
	void delete (int id);
	

}