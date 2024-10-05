package tech.awakelab.SprintFinalModulo6.model.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


import tech.awakelab.SprintFinalModulo6.model.bean.Visita;
import tech.awakelab.SprintFinalModulo6.model.dao.IVisitaDao;

@Repository // Anotación para declarar esta clase como un repositorio
public class VisitaDaoImpl  implements IVisitaDao {
	
	// Definir el logger
//    private static final Logger logger = LoggerFactory.getLogger(VisitaDaoImpl.class);

    @Autowired
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void create(Visita v) {
        String sql = "insert into visitas (cliente_id, fecha_visita, detalle, profesional_id) values (?, ?, ?, ?)";
        template.update(sql, v.getCliente_id(), v.getFecha_visita(), v.getDetalle(), v.getProfesional_id());
    }

    @Override
    public List<Visita> readAll() {
        String sql = "select * from visitas ";
        return template.query(sql, new BeanPropertyRowMapper<>(Visita.class));
    }

    @Override
    public Visita readOne(int id) {
        String sql = "select * from visitas where id = ?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Visita.class));
    }

    @Override
    public void update(Visita v) {
        String sql = "update visitas set cliente_id = ?, fecha_visita = ?, detalle = ?, profesional_id = ? where id = ?";
        template.update(sql, v.getCliente_id(), v.getFecha_visita(), v.getDetalle(), v.getProfesional_id(), v.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from visitas where id = ?";
        template.update(sql, id);
    }

    
}