package tech.awakelab.SprintFinalModulo6.model.dao;

import java.util.List;

import tech.awakelab.SprintFinalModulo6.model.bean.Capacitacion;

public interface ICapacitacionDao {
	void create (Capacitacion c);
	List<Capacitacion> readAll ();
	Capacitacion readOne(int id);
	void update (Capacitacion c);
	void delete (int id);

}
