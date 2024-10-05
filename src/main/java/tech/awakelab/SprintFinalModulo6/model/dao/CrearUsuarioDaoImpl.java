package tech.awakelab.SprintFinalModulo6.model.dao;

import java.util.List;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import tech.awakelab.SprintFinalModulo6.model.bean.CrearUsuario;
import tech.awakelab.SprintFinalModulo6.model.bean.Cliente;
import tech.awakelab.SprintFinalModulo6.model.bean.Administrativo;
import tech.awakelab.SprintFinalModulo6.model.bean.Profesional;


@Repository
public class CrearUsuarioDaoImpl implements ICrearUsuarioDao {
//	private static final Logger logger = LoggerFactory.getLogger(ICrearUsuarioDao.class);

	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void create(CrearUsuario c) {
		if (c instanceof Cliente) {
			Cliente cliente = (Cliente) c;
			String sql = "insert into crearUsuarios (nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo, tipoUsuario, nombreEmpresa, direccion, telefonoContacto) "
					+ "values (?, ?, ?, ?, ?, 'Cliente', ?, ?, ?)";
			template.update(sql, cliente.getNombre(), cliente.getPasswordUsuario(), cliente.getRutUsuario(),
					cliente.getFechaNacimiento(), cliente.getSexo(), cliente.getNombreEmpresa(), cliente.getDireccion(),
					cliente.getTelefonoContacto());
		} else if (c instanceof Profesional) {
			Profesional profesional = (Profesional) c;
			String sql = "insert into crearUsuarios (nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo, tipoUsuario, titulo, fechaIngreso) "
					+ "values (?, ?, ?, ?, ?, 'Profesional', ?, ?)";
			template.update(sql, profesional.getNombre(), profesional.getPasswordUsuario(), profesional.getRutUsuario(),
					profesional.getFechaNacimiento(), profesional.getSexo(), profesional.getTitulo(),
					profesional.getFechaIngreso());
		} else if (c instanceof Administrativo) {
			Administrativo administrativo = (Administrativo) c;
			String sql = "insert into crearUsuarios (nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo, tipoUsuario, area, experienciaPrevia) "
					+ "values (?, ?, ?, ?, ?, 'Administrativo', ?, ?)";
			template.update(sql, administrativo.getNombre(), administrativo.getPasswordUsuario(),
					administrativo.getRutUsuario(), administrativo.getFechaNacimiento(), administrativo.getSexo(),
					administrativo.getArea(), administrativo.getExperienciaPrevia());
		}
	}

	@Override
	public List<CrearUsuario> readAll() {
		String sql = "select nombre, passwordusuario, rutusuario, fechanacimiento, sexo, tipousuario from crearusuarios";
		return template.query(sql, new CrearUsuarioRowMapper());
	}

	@Override
	public CrearUsuario readOne(int id) {
		String sql = "select * from crearUsuarios where id = ?";
		return template.queryForObject(sql, new Object[] { id }, new CrearUsuarioRowMapper());
	}

	@Override
	public void update(CrearUsuario c) {
		if (c instanceof Cliente) {
			Cliente cliente = (Cliente) c;
			String sql = "update crearUsuarios set nombre = ?, passwordUsuario = ?, rutUsuario = ?, fechaNacimiento = ?, sexo = ?, nombreEmpresa = ?, direccion = ?, telefonoContacto = ? where id = ?";
			template.update(sql, cliente.getNombre(), cliente.getPasswordUsuario(), cliente.getRutUsuario(),
					cliente.getFechaNacimiento(), cliente.getSexo(), cliente.getNombreEmpresa(), cliente.getDireccion(),
					cliente.getTelefonoContacto(), cliente.getId());
		} else if (c instanceof Profesional) {
			Profesional profesional = (Profesional) c;
			String sql = "update crearUsuarios set nombre = ?, passwordUsuario = ?, rutUsuario = ?, fechaNacimiento = ?, sexo = ?, titulo = ?, fechaIngreso = ? where id = ?";
			template.update(sql, profesional.getNombre(), profesional.getPasswordUsuario(), profesional.getRutUsuario(),
					profesional.getFechaNacimiento(), profesional.getSexo(), profesional.getTitulo(),
					profesional.getFechaIngreso(), profesional.getId());
		} else if (c instanceof Administrativo) {
			Administrativo administrativo = (Administrativo) c;
			String sql = "update crearUsuarios set nombre = ?, passwordUsuario = ?, rutUsuario = ?, fechaNacimiento = ?, sexo = ?, area = ?, experienciaPrevia = ? where id = ?";
			template.update(sql, administrativo.getNombre(), administrativo.getPasswordUsuario(),
					administrativo.getRutUsuario(), administrativo.getFechaNacimiento(), administrativo.getSexo(),
					administrativo.getArea(), administrativo.getExperienciaPrevia(), administrativo.getId());
		}
	}

	@Override
	public void delete(int id) {
		String sql = "delete from crearUsuarios where id = ?";
		template.update(sql, id);
	}

	class CrearUsuarioRowMapper implements RowMapper<CrearUsuario> {
		@Override
		public CrearUsuario mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new CrearUsuario(rs.getString("nombre"), rs.getString("passwordUsuario"),
					rs.getString("rutUsuario"), rs.getString("fechaNacimiento"), rs.getString("sexo"), rs.getString("tipoUsuario"));
			
		}
	}
}
