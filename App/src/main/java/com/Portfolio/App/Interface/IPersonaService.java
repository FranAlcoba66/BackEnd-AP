package com.Portfolio.App.Interface;

import com.Portfolio.App.Entity.Persona;
import java.util.List;


public interface IPersonaService {

    //Traer una lista de personas
    public List<Persona> getPersona();

    //Guardar un objeto persona
    public void savePersona(Persona persona);

    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);

    //Buscar Persona por id
    public Persona findPersona(Long id);

}
