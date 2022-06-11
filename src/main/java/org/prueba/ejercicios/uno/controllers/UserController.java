package org.prueba.ejercicios.uno.controllers;

import java.util.List;
import org.prueba.ejercicios.uno.model.entities.User;
import org.prueba.ejercicios.uno.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping(path = "/users", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public User insert(@RequestBody User user) {
        return service.save(user);
    }

    @PatchMapping(path = "/users", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public User modify(@RequestBody User user) {
        return service.save(user);
    }

    @DeleteMapping(path = "/users", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public User delete(@RequestBody User user) {
        service.delete(user);
        return user;
    }

    @GetMapping(path = "/users", produces = "application/json")
    public User find(@RequestParam int id) {
        return service.find(id);
    }

    @GetMapping(path = "/users/all", produces = "application/json")
    public List<User> findAll(@RequestParam int page) {
        return service.findAll(page);
    }
}
