package com.mycompany.spark2_ej1;
import static spark.Spark.get;

public class Main {
    public static void main(String[] args) { 
        
        //consulta -> http://localhost:4567/getList
        
        /*
        No se logro poder consultar una lista sin ingresar todos los campos,
        por esto estan las condiciones comentadas en ListaControlador.
        Tampoco se logro mantener los numero ingresados en la forma utilizando
        value="$!{lista.get(0)}" en cada imput
        */
        
        get("/getList",ListaControlador.getList); 
    }
}
