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
import tech.awakelab.SprintFinalModulo6.model.bean.Usuario;
import tech.awakelab.SprintFinalModulo6.model.dao.CapacitacionDaoImpl.CapacitacionRowMapper;

import org.springframework.jdbc.core.RowMapper;	// RowMapper
import java.sql.ResultSet;	// ResultSet
import java.sql.SQLException;	//SQLException para el back-end 

@Repository // Anotación para declarar esta clase como un repositorio
public class UsuarioDaoImpl implements IUsuarioDao {

	// Definir el logger
//    private static final Logger logger = LoggerFactory.getLogger(CapacitacionDaoImpl.class);
	
	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
    public List<Usuario> readAll() {
        String sql = "select id, nombre, tipousuario, rutusuario, fechanacimiento, sexo, direccion from usuarios";
        return template.query(sql, new UsuarioRowMapper());
    }
    
    @Override
    public Usuario readOne(int id) {
    	String sql = "select id, nombre, tipousuario, rutusuario, fechanacimiento, sexo, direccion from usuarios "
    			+ "where id = ?";
    	return template.queryForObject(sql, new Object[] {id}, new UsuarioRowMapper());
    }
    
    class UsuarioRowMapper implements RowMapper<Usuario> {
    	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
    		return new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("tipo"), rs.getString("rutUsuario"), 
    				rs.getString("fechaNacimiento"), rs.getString("sexo"), rs.getString("direccion"));
    	}
    }
    
}
