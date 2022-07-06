package com.Portfolio.App.Service;

import com.Portfolio.App.Entity.Contacto;
import com.Portfolio.App.Interface.IContactoService;
import com.Portfolio.App.Repository.IContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImpContactoService implements IContactoService {

    @Autowired IContactoRepository icontactoRepository;

    @Override
    public List<Contacto> getContacto() {
        List<Contacto> contacto = icontactoRepository.findAll();
        return contacto;
    }

    @Override
    public void saveContacto(Contacto contacto) {
        icontactoRepository.save(contacto);
    }

    @Override
    public void deleteContacto(Long id) {
        icontactoRepository.deleteById(id);
    }

    @Override
    public Contacto findContacto(Long id) {
        Contacto contacto = icontactoRepository.findById(id).orElse(null);
        return contacto;
    }

}
