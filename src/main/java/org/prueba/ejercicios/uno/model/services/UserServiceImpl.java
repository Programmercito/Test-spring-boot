package org.prueba.ejercicios.uno.model.services;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.prueba.ejercicios.uno.controllers.exceptionadvice.DontFoundException;
import org.prueba.ejercicios.uno.model.crud.UserCrud;
import org.prueba.ejercicios.uno.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
            throw new DontFoundException();
        } else {
            return resul.get();
        }

    }

    @Override
    public List<User> findAll(int pagina) {
        List<User> resul = new ArrayList<User>();
        PageRequest page = PageRequest.of(pagina, 10);
        Page<User> findAll = data.findAll(page);
        findAll.forEach(resul::add);

        if (resul.isEmpty()) {
            throw new DontFoundException();
        } else {
            return resul;
        }
    }
}
