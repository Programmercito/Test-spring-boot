package org.prueba.ejercicios.uno.model.crud;

import org.prueba.ejercicios.uno.model.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
@Repository
public interface UserCrud extends CrudRepository<User, Integer>, PagingAndSortingRepository<User, Integer>{
    
}
