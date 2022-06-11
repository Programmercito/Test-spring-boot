package org.prueba.ejercicios.uno.model.services;

import org.prueba.ejercicios.uno.model.entities.User;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
public interface UserService {

    public User save(User usuario);

    public void delete(User usuario);

    public User find(int id);

    public User findAll(int pagina);
}
