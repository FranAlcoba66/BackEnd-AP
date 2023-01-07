
package com.Portfolio.App.Repository;

import com.Portfolio.App.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto ,Long> {
    
}
