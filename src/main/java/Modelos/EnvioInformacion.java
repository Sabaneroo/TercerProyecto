/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class EnvioInformacion implements Serializable{
    public ArrayList<Usuario> UsuarioRegistrados;
    public Usuario usuario;

    public EnvioInformacion(ArrayList<Usuario> UsuarioRegistrados) {
        this.UsuarioRegistrados = UsuarioRegistrados;
    }

    public EnvioInformacion(ArrayList<Usuario> UsuarioRegistrados, Usuario usuario) {
        this.UsuarioRegistrados = UsuarioRegistrados;
        this.usuario = usuario;
    }

    public EnvioInformacion(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
