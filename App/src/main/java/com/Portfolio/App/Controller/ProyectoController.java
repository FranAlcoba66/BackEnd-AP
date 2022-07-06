
package com.Portfolio.App.Controller;

import com.Portfolio.App.Entity.Proyecto;
import com.Portfolio.App.Interface.IProyectoService;
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
public class ProyectoController {
    
    @Autowired IProyectoService iproyectoService;
    
        
    @GetMapping("proyecto/traer")
    public List<Proyecto> getProyecto (){
        return iproyectoService.getProyecto();
    }
    
    
    @PostMapping("proyecto/crear")
    public String createProyecto (@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        return "el proyecto fue creada correctamente" ;
    }
    
    @DeleteMapping("proyecto/borrar/id")
    public String deleteProyecto (@PathVariable Long id){
        iproyectoService.deleteProyecto(id);
        return "el proyecto fue eliminada";
    }
    
    //URL puerto/persona/editar/id/nombre&apellido&img
    @PutMapping("proyecto/editar/id")
    public Proyecto editarProyecto(@PathVariable Long id,
                                 @RequestParam("titulo") String nuevoTitulo,
                                 @RequestParam("descripcion") String nuevoDescripcion,
                                 @RequestParam("img") String nuevoImg )
    {
        Proyecto proyecto= iproyectoService.findProyecto(id);
        proyecto.setTitulo(nuevoTitulo);
        proyecto.setDescripcion(nuevoDescripcion);
        proyecto.setImg(nuevoImg);
        return proyecto;
    }
    
}
