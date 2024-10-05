package tech.awakelab.SprintFinalModulo6.model.dao;

import java.util.List;

import tech.awakelab.SprintFinalModulo6.model.bean.Usuario;

public interface IUsuarioDao {
	List<Usuario> readAll ();
	Usuario readOne(int id);
}
