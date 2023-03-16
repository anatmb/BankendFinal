/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.anadeska.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author UP
 */
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @NotBlank
    private String nombre;
    @NotBlank
    private String imgproyecto;
    @NotBlank
    private String linkproyecto;

    public Proyecto() {
    }

    public Proyecto(String nombre, String imgproyecto, String linkproyecto) {
        this.nombre= nombre;
        this.imgproyecto = imgproyecto;
        this.linkproyecto = linkproyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgproyecto() {
        return imgproyecto;
    }

    public void setImgproyecto(String imgproyecto) {
        this.imgproyecto = imgproyecto;
    }

    public String getLinkproyecto() {
        return linkproyecto;
    }

    public void setLinkproyecto(String linkproyecto) {
        this.linkproyecto = linkproyecto;
    } 
}