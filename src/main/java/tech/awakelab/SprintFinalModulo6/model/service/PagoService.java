package tech.awakelab.SprintFinalModulo6.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.SprintFinalModulo6.model.bean.Pago;
import tech.awakelab.SprintFinalModulo6.model.dao.PagoDaoImpl;

@Service
public class PagoService {
	
	@Autowired
	PagoDaoImpl pDAO;
	
	public PagoService() {
		super();
	}
	
	// Método para obtener todos los pagos
	public List<Pago> getAll(){
		return pDAO.readAll();
	}
	
	// Método para obtener un pago por su ID
    public Pago getOne(int id) {
        return pDAO.readOne(id);
    }

    // Método para crear un nuevo pago
    public void create(Pago pago) {
        pDAO.create(pago);
    }

    // Método para actualizar un pago existente
    public void update(Pago pago) {
        pDAO.update(pago);
    }

    // Método para eliminar un pago por su ID
    public void delete(int id) {
        pDAO.delete(id);
    }
}
