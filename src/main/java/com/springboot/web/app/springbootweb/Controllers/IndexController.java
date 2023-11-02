package com.springboot.web.app.springbootweb.Controllers;

import com.springboot.web.app.springbootweb.Models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index", "", "/home"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework!");
        return "index";
    }

    @RequestMapping("/perfil")
    public String Perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Bryan");
        usuario.setApellido("Guzman");
        usuario.setEmail("bryan@gmail.com");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model){
        model.addAttribute("titulo", "Listado de usuarios");
        return "listar";
    }
    @ModelAttribute("usuarios")
    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios = Arrays.asList(new Usuario("Andres","Guzman","andres@"),
                new Usuario("Bryan","Salgado","Bryan@"),
                new Usuario("Anderson","Romero","Ander@"),
                new Usuario("Jesus","Trujillo","Ander@")
        );
        return usuarios;
    }
}
