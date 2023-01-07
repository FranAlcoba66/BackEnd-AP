
package com.Portfolio.App.Interface;

import com.Portfolio.App.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    //Guardar un objeto educacion
    public void saveExperiencia(Experiencia experiencia);

    //Eliminar un objeto pero lo buscamos por ID
    public void deleteExperiencia(Long id);

    //Buscar Experiencia por id
    public Experiencia findExperiencia (Long id);
    
}
