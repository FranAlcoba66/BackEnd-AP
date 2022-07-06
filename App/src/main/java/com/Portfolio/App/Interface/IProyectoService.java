
package com.Portfolio.App.Interface;

import com.Portfolio.App.Entity.Proyecto;
import java.util.List;



public interface IProyectoService {
    
    //Traer una lista de proyectos
    public List<Proyecto>  getProyecto();
    
    //Guardar un objeto Proyecto
    public void saveProyecto (Proyecto proyecto) ;
    
    
    //Eliminar un objeto Proyecto  pero lo buscamos por ID
    public void deleteProyecto (Long id);
    
    
    //Buscar Proyecto por id
    public Proyecto findProyecto(Long id);
    
}
