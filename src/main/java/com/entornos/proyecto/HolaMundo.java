package com.entornos.proyecto;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 
@RestController
public class HolaMundo {

   @GetMapping("/")
   public String saludar(){
       return "Esta es tu primera web backend";
   }
 
   @GetMapping("/despidete")
   public String despidete(){
        return "Adiós amigo";
   }

   @GetMapping("/saludame/{nombre}")
   public String saludame(@PathVariable String nombre){
       return "Hola qué tal " + nombre;
   }

   @GetMapping("/saluda")
   public String SaludaPorQuery(@RequestParam String nombre,@RequestParam String apellidos){
       //return "Hola qué tal estás" + nombre + " " + apellidos;
       Object params[] = {nombre, apellidos};
       return MessageFormat.format("Qué tal estás {0} {1}", params);
   }


}