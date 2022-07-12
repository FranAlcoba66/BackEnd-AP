package com.Portfolio.App.Controller;

import com.Portfolio.App.Entity.Persona;
import com.Portfolio.App.Interface.IPersonaService;
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
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

    @PostMapping("/crear")
    public void createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
       // return "la persona fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public void deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
      //  return "la persona fue eliminada";
    }

    //URL puerto/persona/editar/id/nombre&apellido&img
    @PutMapping("personas/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
            @RequestBody Persona persona) {
        persona.setId(id);
        ipersonaService.savePersona(persona);
        return persona;
    }

    @GetMapping("/traer/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((long) 1);
    }

}
