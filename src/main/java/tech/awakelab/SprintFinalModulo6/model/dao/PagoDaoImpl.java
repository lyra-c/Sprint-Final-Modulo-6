package tech.awakelab.SprintFinalModulo6.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import tech.awakelab.SprintFinalModulo6.model.bean.Pago;

@Repository
public class PagoDaoImpl implements IPagoDao {
	
	@Autowired
	JdbcTemplate template;

	// Getters y setters para JdbcTemplate
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void create(Pago p) {
		String sql = "insert into pago (monto, fecha, rutCliente, capacitacion) values (?, ?, ?, ?)";
		template.update(sql, p.getMonto(), p.getFecha(), p.getRutCliente(), p.getCapacitacion());
	}

	@Override
	public List<Pago> readAll() {
		String sql = "select id, monto, fecha, rutCliente, capacitacion from pago";
		return template.query(sql, new PagoRowMapper());
	}

	@Override
	public Pago readOne(int id) {
		String sql = "select id, monto, fecha, rutCliente, capacitacion from pago where id = ?";
		try {
			return template.queryForObject(sql, new Object[] {id}, new PagoRowMapper());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public void update(Pago p) {
		String sql = "update pago set monto = ?, fecha = ?, rutCliente = ?, capacitacion = ? where id = ?";
		template.update(sql, p.getMonto(), p.getFecha(), p.getRutCliente(), p.getCapacitacion(), p.getId());
	}

	@Override
	public void delete(int id) {
		String sql = "delete from pago where id = ?";
		template.update(sql, id);
	}

	// Clase interna para mapear el resultado de la consulta a un objeto Pago
	class PagoRowMapper implements RowMapper<Pago> {
		@Override
		public Pago mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Pago(
				rs.getInt("id"), 
				rs.getDouble("monto"), 
				rs.getDate("fecha"), 
				rs.getString("rutCliente"), 
				rs.getString("capacitacion")
			);
		}
	}
}
