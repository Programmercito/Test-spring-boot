package org.prueba.ejercicios.uno.model.services;

import java.util.List;
import org.prueba.ejercicios.uno.model.entities.User;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
public interface UserService {

    public User save(User usuario);

    public void delete(User usuario);

    public User find(int id);

    public List<User> findAll(int pagina);
}
