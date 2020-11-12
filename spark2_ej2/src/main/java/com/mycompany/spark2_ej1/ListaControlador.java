package com.mycompany.spark2_ej1;

import spark.Request;
import spark.Response;
import spark.Route;
import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class ListaControlador {
    public static Route index = (Request req, Response res) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/index.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    public static Route getIMC = (Request req, Response res) -> {
                
        double peso = Double.parseDouble(req.queryParams("peso"));
        double altura = Double.parseDouble(req.queryParams("altura"));
        String b = req.queryParams("btn_imc");
       
       
        ListaDAO lDAO = new ListaDAO();
        float numeros = lDAO.getLista(peso, altura, b);
        String tipo= lDAO.tipo(numeros);
        
        HashMap model = new HashMap();
        model.put("lista", numeros);
          model.put("tipo", tipo);
        model.put("template", "templates/IMC.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };

}
