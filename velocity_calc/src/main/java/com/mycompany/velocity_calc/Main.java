package com.mycompany.velocity_calc;

import static spark.Spark.* ;
/**
 *
 * @author Gaston
 */
public class Main {
    public static void main(String[] args) { 
        /*
        la calculadora se llama a la direccion:
        http://localhost:4567/calculadora
        
        --- Soporta una operacion tras otra 
            (calculando sobre el resultado de la anterior).
        
        --- Al pulsar un numero mientras se muestra un resultado,
            este se sobreescribe para una nueva operacion.
        
        --- Al ingresar un numero y luego presionar =
            el resultado es el mismo numero        
        */
        staticFiles.location("/public");
        
        get("/calculadora", Controlador.calculadora);
        get("/none", Controlador.none);
        get("/getSuma", Controlador.getSuma);
        get("/getResta", Controlador.getResta);
        get("/getProducto", Controlador.getProducto);
        get("/getCociente", Controlador.getCociente);
    }
}
