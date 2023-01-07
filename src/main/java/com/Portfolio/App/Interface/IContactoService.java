package com.Portfolio.App.Interface;

import com.Portfolio.App.Entity.Contacto;
import java.util.List;



public interface IContactoService {

    //Traer una lista deContacto
    public List<Contacto> getContacto();

    //Guardar un objeto Contacto
    public void saveContacto(Contacto contacto);

    //Eliminar un objeto pero lo buscamos por ID
    public void deleteContacto(Long id);

    //Buscar Contacto por id
    public Contacto findContacto(Long id);
}
