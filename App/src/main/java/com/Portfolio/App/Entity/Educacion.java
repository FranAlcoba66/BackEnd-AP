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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message =" no comple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message =" no comple con la longitud")
    private String institucion;

    @NotNull
    @Size(min = 1, max = 50, message =" no comple con la longitud")
    private String fechaIni;
    
    @NotNull
    @Size(min = 1, max = 50, message =" no comple con la longitud")
    private String fechaFin;
}
