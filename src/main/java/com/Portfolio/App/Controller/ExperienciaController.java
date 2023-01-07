
package com.Portfolio.App.Controller;

import com.Portfolio.App.Entity.Experiencia;
import com.Portfolio.App.Interface.IExperienciaService;
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
//@CrossOrigin("http://localhost:4200")
@CrossOrigin(origins = "*")
@RequestMapping("/experiencia")
public class ExperienciaController {
    
    @Autowired IExperienciaService iexperienciaService ;
    
    @GetMapping("/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @GetMapping("/traer/{id}")
    public Experiencia getExperienciaId(@PathVariable("id") Long id) {
        return iexperienciaService.findExperiencia(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createExperiencia(@RequestBody Experiencia experiencia) {
        iexperienciaService.saveExperiencia(experiencia);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteExperiencia(@PathVariable Long id) {
        iexperienciaService.deleteExperiencia(id);
    }

    
        //URL puerto/educacion/editar/id/nombre&apellido&img
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Experiencia editarExperiencia(@PathVariable("id") Long id,
            @RequestBody Experiencia experiencia) {
        experiencia.setId(id);
        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }


     
}
