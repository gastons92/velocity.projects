/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spark2_ej24;


import java.util.HashMap;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author Dario
 */
public class CircunferenciaControlador {
    public static Route index = (Request req, Response res) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/index.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
    public static Route getCircunferencia = (Request req, Response res) -> {
        double r = Double.parseDouble(req.queryParams("radio"));
        String b = req.queryParams("btn_cir");
        
        Circulo c= new Circulo();
        c.getCirculo(r,b);
        
        HashMap model = new HashMap();
        
        model.put("radio",r);
        model.put("perimetro",c.getPerimetro());
        model.put("area",c.getArea());
        model.put("template", "templates/circulo.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
        
    };
    
}
