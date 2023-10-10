package br.com.rocketseat.todolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class ControllerTeste {
    
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
