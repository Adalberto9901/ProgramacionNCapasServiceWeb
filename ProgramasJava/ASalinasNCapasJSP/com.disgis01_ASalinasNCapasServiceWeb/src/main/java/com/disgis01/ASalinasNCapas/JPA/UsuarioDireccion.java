/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disgis01.ASalinasNCapas.JPA;

import java.util.List;

/**
 *
 * @author Alien 1
 */
public class UsuarioDireccion {
    public Usuario Usuario;
    public Direccion Direccion;
    public List<Direccion> Direcciones;

    public UsuarioDireccion() {
    }
    
    public UsuarioDireccion(Usuario Usuario) {
        this.Usuario = Usuario;
    }
    
    public UsuarioDireccion(Usuario Usuario, Direccion Direccion) {
        this.Usuario = Usuario;
        this.Direccion = Direccion;
    }
    
    public UsuarioDireccion(Usuario Usuario, Direccion Direccion, List<Direccion> Direcciones) {
        this.Usuario = Usuario;
        this.Direccion = Direccion;
        this.Direcciones = Direcciones;
    }
    
    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Direccion getDireccion() {
        return Direccion;
    }

    public void setDireccion(Direccion Direccion) {
        this.Direccion = Direccion;
    }
    
    
}
