package com.entornos.proyecto.controllers;
 
import com.entornos.proyecto.services.PokemonBDService;
import com.entornos.proyecto.services.PokemonService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class WebController {
   
   @RequestMapping("/pesoPokemon")
   public String peso(@PathVariable String nombrePokemon,
                   Model modelo){
       modelo.addAttribute("nombre", "Pikachu");
       modelo.addAttribute("peso", 20);
       modelo.addAttribute("foto", "https://i.pinimg.com/originals/dc/ab/b7/dcabb7fbb2f763d680d20a3d228cc6f9.jpg");
       return "pokemon";
   }
}
