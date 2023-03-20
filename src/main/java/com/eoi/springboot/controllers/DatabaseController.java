package com.eoi.springboot.controllers;
import com.eoi.springboot.database.RepositorioUsuarios;
import com.eoi.springboot.entidades.EntidadUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The type Database controller.
 */
@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class DatabaseController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private RepositorioUsuarios userRepository;

    /**
     * Add new user string.
     *
     * @param name  the name
     * @param email the email
     * @return the string
     */
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        EntidadUsuario n = new EntidadUsuario();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    /**
     * Gets all users.
     *
     * @return the all users
     */
    @GetMapping(path="/all")
    public @ResponseBody Iterable<EntidadUsuario> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

}