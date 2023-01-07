package com.Portfolio.App.Repository;

import com.Portfolio.App.Entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IContactoRepository extends JpaRepository<Contacto, Long> {

}
