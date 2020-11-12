package com.mycompany.velocity;

import static spark.Spark.*;

public class PersonaMain {
            public static void main(String[] args) { 
            /*
            Se llama a la direccion:
            http://localhost:4567/getPersonas
            */
            
            staticFiles.location("/public");
                
            get("/getPersonas",PersonaControlador.getPersonas); 
            get("/getHijos",PersonaControlador.getHijos); 
            get("/getNietos",PersonaControlador.getNietos); 
            get("/getPadres",PersonaControlador.getPadres); 
            get("/getHermanos",PersonaControlador.getHermanos); 
            get("/getTios",PersonaControlador.getTios);
            get("/getSobrinos",PersonaControlador.getSobrinos);
        } 
}
