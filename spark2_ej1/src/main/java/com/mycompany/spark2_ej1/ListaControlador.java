package com.mycompany.spark2_ej1;

import java.util.ArrayList;
import spark.Request;
import spark.Response;
import spark.Route;
import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class ListaControlador {
    public static Route getList = (Request req, Response res) -> {
                
        String s0 = req.queryParams("num0");
        String s1 = req.queryParams("num1");
        String s2 = req.queryParams("num2");
        String s3 = req.queryParams("num3");
        String s4 = req.queryParams("num4");
        String s5 = req.queryParams("num5");
        String b = req.queryParams("btn_order");
        
        ListaDAO lDAO = new ListaDAO();
        ArrayList <Integer> numeros = lDAO.getLista(s0, s1, s2, s3, s4, s5, b);
        
        HashMap model = new HashMap();
        model.put("lista", numeros);
        model.put("template", "templates/centerList.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
}
