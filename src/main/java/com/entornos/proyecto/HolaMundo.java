package com.entornos.proyecto;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HolaMundo {

   @RequestMapping("/")
   public String saludar(){
        String bienvenida = "Esta es tu primera web backend";
       return bienvenida;
   }
 
   @RequestMapping("/despidete")
   public String despidete(){
        String despedida = "Adios amigo";
       return despedida;
   }
}