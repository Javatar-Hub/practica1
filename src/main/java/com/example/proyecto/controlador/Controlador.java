package com.example.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Controlador {

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @PostMapping("/procesa")
  public String procesa(HttpServletRequest request, Model model) {
    String nombre = request.getParameter("nombre");
    String rol = request.getParameter("rol");
    System.out.println("nombre -> " + nombre);
    System.out.println("rol -> " + rol);
    model.addAttribute("nombre", nombre);
    model.addAttribute("rol", rol);
    return "final";
  }

}
