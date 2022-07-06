
package com.Portfolio.App.Repository;

import com.Portfolio.App.Entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IHabilidadRepository extends JpaRepository<Habilidad,Long> {
    
}
