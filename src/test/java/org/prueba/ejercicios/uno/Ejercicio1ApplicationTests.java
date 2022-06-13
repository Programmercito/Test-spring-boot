package org.prueba.ejercicios.uno;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.prueba.ejercicios.uno.model.entities.User;
import org.prueba.ejercicios.uno.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ejercicio1ApplicationTests {

    @Autowired
    UserService service;
    User usuario;

    @Test
    void test() {
        User usuario = new User();
        usuario.setFirstname("Joaquin");
        usuario.setLastname("Heredia");
        usuario.setEmail("joaquin@server.com");
        usuario.setUsername("jheredia");
        User resul = service.save(usuario);
        System.out.println("test insert");
        assertNotNull(resul);
        this.usuario=resul;
        usuario.setFirstname("Joaquin Alberto");
        resul = service.save(usuario);
        System.out.println("test update");
        assertNotNull(resul);
        this.usuario=resul;
        resul = service.find(usuario.getId());
        System.out.println("test get");
        assertNotNull(resul);
        service.delete(usuario);
        System.out.println("test delete");
    }

}
