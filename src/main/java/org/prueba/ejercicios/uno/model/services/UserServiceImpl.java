package org.prueba.ejercicios.uno.model.services;

import java.util.Optional;
import org.prueba.ejercicios.uno.model.crud.UserCrud;
import org.prueba.ejercicios.uno.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserCrud data;

    @Override
    public User save(User usuario) {
        User resul = data.save(usuario);
        return resul;
    }

    @Override
    public void delete(User usuario) {
        data.delete(usuario);
    }

    @Override
    public User find(int id) {
        Optional<User> resul = data.findById(id);
        if (resul.isEmpty()) {
            return null;
        } else {
            return resul.get();
        }

    }

    @Override
    public User findAll(int pagina) {
        if (pagina==0){
            Iterable<User> findAll = data.findAll();
        }
    }
}
