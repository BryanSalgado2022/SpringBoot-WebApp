package com.springboot.web.app.springbootweb.Controllers;

import com.springboot.web.app.springbootweb.Models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }
}
