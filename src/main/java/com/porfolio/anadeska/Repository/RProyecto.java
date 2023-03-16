/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.anadeska.Repository;

import com.porfolio.anadeska.Entity.Proyecto;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author UP
 */
public interface RProyecto extends JpaRepository<Proyecto, Integer> {
    
     Optional<Proyecto> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
