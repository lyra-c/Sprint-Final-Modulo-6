package tech.awakelab.SprintFinalModulo6.model.dao;

import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tech.awakelab.SprintFinalModulo6.model.bean.Checklist;
import tech.awakelab.SprintFinalModulo6.model.dao.IChecklistDao;

@Repository
public class ChecklistDaoImpl  implements IChecklistDao{
    
	// Definir el logger
//    private static final Logger logger = LoggerFactory.getLogger(ChecklistDaoImpl.class);

    @Autowired
    JdbcTemplate template;


    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

        // Insertar un nuevo checklist
    public void  create(Checklist checklist) {
        String sql = "insert into Chequeos (visita_id, detalle, estado) values (?, ?, ?)";
        template.update(sql, checklist.getVisitaId(), checklist.getDetalle(), checklist.getEstado());
    }

    @Override
    public List<Checklist> readAll() {
        String sql = "select * from Chequeos ";
        return template.query(sql, new BeanPropertyRowMapper<>(Checklist.class));
    }


    @Override
    public Checklist readOne(int id) {
        String sql = "select * from Chequeos where id = ?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Checklist.class));
    }

    @Override
    public void update(Checklist checklist) {
        String sql = "update Chequeos set visita_id = ?, detalle = ?, estado = ? where id = ?";
        template.update(sql, checklist.getVisitaId(), checklist.getDetalle(), checklist.getEstado());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from Chequeos where id = ?";
        template.update(sql, id);
    }

    
}