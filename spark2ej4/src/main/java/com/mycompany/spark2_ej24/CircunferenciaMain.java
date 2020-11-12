/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spark2_ej24;

import static spark.Spark.get;
import static spark.Spark.staticFiles;


/**
 *
 * @author Dario
 */
public class CircunferenciaMain {
    public static void main(String[] args){
        //EJERCICIO 3
        staticFiles.location("/public");
        get("/index", CircunferenciaControlador.index);
        get("/getCircunferencia", CircunferenciaControlador.getCircunferencia);
    }
}
