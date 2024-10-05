package tech.awakelab.SprintFinalModulo6.model.dao;

import java.util.List;

import tech.awakelab.SprintFinalModulo6.model.bean.Visita;

public interface IVisitaDao {
	void create (Visita v);
	List<Visita> readAll ();
	Visita readOne(int id);
	void update (Visita v);
	void delete (int id);
	

}
