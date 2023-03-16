/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.anadeska.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author UP
 */
public class dtoProyecto {
    
     
    @NotBlank
    private String nombre;
    @NotBlank
    private String linkproyecto;
    @NotBlank
    private String imgproyecto;
    
    
    
    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String linkproyecto, String imgproyecto) {
        this.nombre = nombre;
        this.linkproyecto = linkproyecto;
        this.imgproyecto = imgproyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getLinkproyecto() {
        return linkproyecto;
    }

    public void setLinkproyecto(String linkproyecto) {
        this.linkproyecto = linkproyecto;
    }

    public String getImgproyecto() {
        return imgproyecto;
    }

    public void setImgproyecto(String imgproyecto) {
        this.imgproyecto = imgproyecto;
    }    
}
