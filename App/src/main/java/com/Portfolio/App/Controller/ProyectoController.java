
package com.Portfolio.App.Controller;

import com.Portfolio.App.Entity.Proyecto;
import com.Portfolio.App.Interface.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/proyecto")
public class ProyectoController {
    
    @Autowired IProyectoService iproyectoService;
    
        
    @GetMapping("/traer")
    public List<Proyecto> getProyecto (){
        return iproyectoService.getProyecto();
    }
    
    
    @PostMapping("/crear")
    public void createProyecto (@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        //return "el proyecto fue creada correctamente" ;
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteProyecto (@PathVariable Long id){
        iproyectoService.deleteProyecto(id);
       // return "el proyecto fue eliminada";
    }
    
    //URL puerto/persona/editar/id/nombre&apellido&img
    @PutMapping("/editar/{id}")
    public Proyecto editarProyecto(@PathVariable Long id,
                                 @RequestBody Proyecto proyecto) {
        proyecto.setId(id);
        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    }
    
}
