package com.mycompany.spark2_ej1;
import static spark.Spark.get;
import static spark.Spark.staticFiles;

public class Main {
    public static void main(String[] args) { 
        staticFiles.location("/public");
        //consulta -> http://localhost:4567/index
        get("/index",ListaControlador.index); 
        get("/getIMC",ListaControlador.getIMC); 

    }
}
