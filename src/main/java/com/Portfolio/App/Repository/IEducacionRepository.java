
package com.Portfolio.App.Repository;

import com.Portfolio.App.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Long>{

   
    
}
