/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author JoRodr1
 */
public class Silvestre extends Pato {
    
    public Silvestre(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return super.hacerSonido() + " del Pato Lucas ";
    }
    
    
}
