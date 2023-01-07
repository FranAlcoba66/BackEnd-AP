/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.App.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message =" no comple con la longitud")
    private String puesto;

    @NotNull
    @Size(min = 1, max = 50, message =" no comple con la longitud")
    private String empresa;

    @NotNull
    @Size(min = 1, max = 50, message =" no comple con la longitud")
    private String fechaIni;
    
    @NotNull
    @Size(min = 1, max = 50, message =" no comple con la longitud")
    private String fechaFin;
    
    
    private String imagen;
    
}
