package com.eoi.springboot.controllers;

import com.eoi.springboot.MySpringBootApplication;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

/**

 * The type Controlador usuarios.

 */

@RestController
@Log4j2
public class ControladorUsuarios {

    /**

     * Hola string.

     *

     * @return the string

     */

    @GetMapping("/hola")
    String hola() {
        log.warn("Hola Mundo!1");
        return "Hola mundo!3";
    }

    /**

     * Mi medicacion string.

     *

     * @return the string

     */

    @GetMapping("/mimedicacion")
    String miMedicacion() {
        log.warn("Tomate las pastillas");
        return "Tomate las pastillas";
    }


}

