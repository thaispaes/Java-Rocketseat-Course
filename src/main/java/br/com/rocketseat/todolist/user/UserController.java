package br.com.rocketseat.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    /*
     * Tipos de Retornos
     * String
     * Integer
     * Double
     * float
     * char
     * Date
     * void
     */
    @PostMapping("/createUser")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    } 
    
}
