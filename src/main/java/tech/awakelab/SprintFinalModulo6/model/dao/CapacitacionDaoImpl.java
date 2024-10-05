package tech.awakelab.SprintFinalModulo6.model.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import tech.awakelab.SprintFinalModulo6.model.bean.Capacitacion;

import org.springframework.jdbc.core.RowMapper;	// RowMapper
import java.sql.ResultSet;	// ResultSet
import java.sql.SQLException;	//SQLException para el back-end 

@Repository // Anotación para declarar esta clase como un repositorio
public class CapacitacionDaoImpl implements ICapacitacionDao {
    
    // Definir el logger
//    private static final Logger logger = LoggerFactory.getLogger(CapacitacionDaoImpl.class);
	
	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

    @Override
    public void create(Capacitacion c) {
        
    	String sql = "insert capacitaciones (nombre, rutcliente, dia, hora, lugar, duracion, asistentes) "
    			+ "values (?, ?, ?, ?, ?, ?, ?)";
    	template.update(sql, new Object[] {c.getNombre(), c.getRutCliente(), c.getDia(), c.getHora(), 
    			c.getLugar(), c.getDuracion(), c.getAsistentes()});
    }
    
    @Override
    public List<Capacitacion> readAll() {
        String sql = "select id, nombre, rutcliente, dia, hora, lugar, duracion, asistentes from capacitaciones";
        return template.query(sql, new CapacitacionRowMapper());
    }
    
    @Override
    public Capacitacion readOne(int id) {
    	String sql = "select id, nombre, rutcliente, dia, hora, lugar, duracion, asistentes from capacitaciones "
    			+ "where id = ?";
    	return template.queryForObject(sql, new Object[] {id}, new CapacitacionRowMapper());
    }
    
    @Override
    public void update (Capacitacion c) {
    	String sql = "update capacitaciones set nombre = ?, rutcliente = ?, dia = ?, hora = ?, lugar = ?, "
    			+ "duracion = ?, asistentes = ? where id = ?";
    	template.update(sql, new Object[] {c.getNombre(), c.getRutCliente(), c.getDia(), c.getHora(), 
    			c.getLugar(), c.getDuracion(), c.getAsistentes()}, c.getIdentificador());
    }
    
    @Override
    public void delete (int id) {
    	String sql = "delete from capacitaciones where id = ?";
    	template.update(sql, new Object[] {id});
    }
    
    
    class CapacitacionRowMapper implements RowMapper<Capacitacion> {
    	public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
    		return new Capacitacion(rs.getInt("id"), rs.getString("nombre"), rs.getString("rutCliente"), 
    				rs.getString("dia"), rs.getString("hora"), rs.getString("lugar"), rs.getInt("duracion"), 
    				rs.getInt("asistentes"));
    	}
    }
}
