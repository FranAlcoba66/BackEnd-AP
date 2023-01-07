
package com.Portfolio.App.Interface;

import com.Portfolio.App.Entity.Educacion;
import java.util.List;




public interface IEducacionService {
    
        //Traer una lista de educacion
    public List<Educacion> getEducacion();

 
    //Guardar un objeto educacion
    public void saveEducacion(Educacion educacion);

    //Eliminar un objeto pero lo buscamos por ID
    public void deleteEducacion(Long id);

    //Buscar educacion por id
    public Educacion findEducacion(Long id);
}
