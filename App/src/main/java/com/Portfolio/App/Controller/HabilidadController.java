
package com.Portfolio.App.Controller;

import com.Portfolio.App.Entity.Habilidad;
import com.Portfolio.App.Interface.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HabilidadController {
    
    @Autowired IHabilidadService ihabilidadService;
    
    @GetMapping("habilidad/traer")
    public List<Habilidad> getHabilidad(){
        return ihabilidadService.getHabilidad();
    }
    
    @PostMapping("habilidad/crear")
    public String createHabilidad (@RequestBody Habilidad habilidad){
        ihabilidadService.saveHabilidad(habilidad);
        return"habilidad creada correctamente";
    }
    
    @DeleteMapping("habilidad/borrar")
    public String deleteHabilidad (@PathVariable Long id){
        ihabilidadService.deleteHabilidad(id);
      return "la habilidad fue eliminada";
    }
  
    @PutMapping("habilidad/editar/{id}")
    public Habilidad editarHabilidad(@PathVariable Long id,
                                    @RequestParam("nombre") String nuevoNombre,
                                    @RequestParam("value") String nuevoValue,
                                    @RequestParam("logo") String nuevoLogo)
            
            {
        Habilidad habilidad= ihabilidadService.findHabilidad(id);
        habilidad.setNombre(nuevoNombre);
        habilidad.setValue(nuevoValue);
        habilidad.setLogo(nuevoLogo);
        
        return habilidad;
    }
    
}
