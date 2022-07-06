
package com.Portfolio.App.Controller;

import com.Portfolio.App.Entity.Contacto;
import com.Portfolio.App.Interface.IContactoService;
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
public class ContactoController {
    
    @Autowired IContactoService icontactoService;
    
    @GetMapping ("contacto/traer")
    public List<Contacto> getContacto(){
    return icontactoService.getContacto();
    }
    
    @PostMapping ("contacto/")
    public String createContacto(@RequestBody Contacto contacto){
        icontactoService.saveContacto(contacto);
        return "el contacto fue creado correctamente";
    }
    @DeleteMapping("contacto/borrar")
    public String deleteContacto (@PathVariable Long Id){
        icontactoService.deleteContacto(Id);
         return "el contacto fue eliminado correctamente";
    }
    
    @PutMapping ("contacto/editar/{id}")
    public Contacto editarContacto(@PathVariable Long id,
                                   @RequestParam("nombre") String nuevoNombre,
                                   @RequestParam("apellido") String nuevoApellido,
                                   @RequestParam("email") String nuevoEmail,
                                   @RequestParam("mensaje") String nuevoMensaje)
    {
    Contacto contacto = icontactoService.findContacto(id);
    contacto.setNombre(nuevoNombre);
    contacto.setApellido(nuevoApellido);
    contacto.setEmail(nuevoEmail);
    contacto.setMensaje(nuevoMensaje);
    
    return contacto;
    }

}