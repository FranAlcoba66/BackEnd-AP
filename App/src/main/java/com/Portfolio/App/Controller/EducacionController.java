package com.Portfolio.App.Controller;

import com.Portfolio.App.Entity.Educacion;
import com.Portfolio.App.Interface.IEducacionService;
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
//@CrossOrigin(origins = "http://localhost:4200")//
@CrossOrigin(origins = "*")
@RequestMapping("/educacion")

public class EducacionController {

    @Autowired
    IEducacionService ieducacionService;

    @GetMapping("/traer")
    public List<Educacion> getEducacion() {
        return ieducacionService.getEducacion();
    }

    @GetMapping("/traer/{id}")
    public Educacion getEducacionId(@PathVariable("id") Long id) {
        return ieducacionService.findEducacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createEducacion(@RequestBody Educacion educacion) {
        ieducacionService.saveEducacion(educacion);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteEducacion(@PathVariable Long id) {
        ieducacionService.deleteEducacion(id);

    }
    
    //URL puerto/educacion/editar/id/nombre&apellido&img
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Educacion editarEducacion(@PathVariable("id") Long id,
            @RequestBody Educacion educacion) {
        educacion.setId(id);
        ieducacionService.saveEducacion(educacion);
        return educacion;
    }

}
