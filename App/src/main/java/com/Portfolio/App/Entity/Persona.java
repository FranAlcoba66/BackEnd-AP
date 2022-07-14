package com.Portfolio.App.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = " no comple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = " no comple con la longitud")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 50, message = " no comple con la longitud")
    private String titulo;

    @NotNull
    @Size(min = 1, max = 400, message = " no comple con la longitud")
    private String acercaDe;

    
    private String img;
    
   
    private String banner;

}
