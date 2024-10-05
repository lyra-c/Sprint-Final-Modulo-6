package tech.awakelab.SprintFinalModulo6.model.dao;

import java.util.List;

import tech.awakelab.SprintFinalModulo6.model.bean.CrearUsuario;

public interface ICrearUsuarioDao {
    void create(CrearUsuario c);
    List<CrearUsuario> readAll();
    CrearUsuario readOne(int id);
    void update(CrearUsuario c);
    void delete(int id);
}
