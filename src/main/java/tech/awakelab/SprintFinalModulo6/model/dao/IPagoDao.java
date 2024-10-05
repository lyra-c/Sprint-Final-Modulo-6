package tech.awakelab.SprintFinalModulo6.model.dao;

import java.util.List;

import tech.awakelab.SprintFinalModulo6.model.bean.Pago;



public interface IPagoDao {
	
	public void create(Pago p);
	public List<Pago> readAll();
	public Pago readOne(int id);
	public void update(Pago p);
	public void delete(int id);

}
