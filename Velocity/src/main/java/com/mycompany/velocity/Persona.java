package com.mycompany.velocity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Persona {
    String nombre; 
    String apellido; 
    List<Persona> hijos; 
    
    public Persona(String nbre, String ape) {
        nombre = nbre;
        apellido = ape;
        hijos = new ArrayList<Persona>();
    } 

    public List<Persona> getHijos() {
        return hijos;
    }

    public String getNombre() {
       return nombre;
    }
    public String getApellido(){
       return apellido;
    }

    public void addHijo(Persona p){
        hijos.add(p);
    }
}
