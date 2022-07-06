
package com.Portfolio.App.Interface;

import com.Portfolio.App.Entity.Habilidad;
import java.util.List;




public interface IHabilidadService {
    
    //Trae listado de Habilidades
    public List<Habilidad> getHabilidad();
    
        
     //Guarda habilidad
    public void saveHabilidad (Habilidad habilidad);
    
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteHabilidad (Long id);
    
    
    //Buscar Habilidad por id
    public Habilidad findHabilidad(Long id);
    
    
    
    
    
}
