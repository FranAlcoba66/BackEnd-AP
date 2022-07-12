
package com.Portfolio.App.Controller;

import com.Portfolio.App.Entity.Habilidad;
import com.Portfolio.App.Interface.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/habilidad")
public class HabilidadController {
    
    @Autowired IHabilidadService ihabilidadService;
    
    @GetMapping("/traer")
    public List<Habilidad> getHabilidad(){
        return ihabilidadService.getHabilidad();
    }
    @GetMapping("/traer/{id}")
    public Habilidad getHabilidadId(@PathVariable("id") Long id) {
        return ihabilidadService.findHabilidad(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createHabilidad (@RequestBody Habilidad habilidad){
        ihabilidadService.saveHabilidad(habilidad);
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteHabilidad (@PathVariable Long id){
        ihabilidadService.deleteHabilidad(id);
      
    }
  
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Habilidad editarHabilidad(@PathVariable Long id,
                                    @RequestBody Habilidad habilidad)
    {
     habilidad.setId(id);
     ihabilidadService.saveHabilidad(habilidad);
     return habilidad;
        
    }
    
}
