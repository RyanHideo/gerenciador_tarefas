package br.com.oogakidev.twtodos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.oogakidev.twtodos.repositories.TodoRepository;


@Controller
public class HomeController{

    private final TodoRepository todoRepository;
    
    public HomeController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public ModelAndView home(){
        var ModelAndView = new ModelAndView("home");
        ModelAndView.addObject("nome", "Ryan Hideo" );
        var alunos = List.of("Cleyson lima", "Wesley Gonzaga", "Anderson Miranda");
        ModelAndView.addObject("alunos",alunos);
        ModelAndView.addObject("ehProgramador", true);
        
        
        var todos = todoRepository.findAll();
        System.out.println(todos);
        
        return ModelAndView;
    }


}