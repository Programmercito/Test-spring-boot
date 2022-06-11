package org.prueba.ejercicios.uno.controllers.exceptionadvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
@ControllerAdvice
public class DontFoundDataHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)  
    @ExceptionHandler(DontFoundException.class)
    public void handleConflict() {
        // Nothing to do
    }
}
