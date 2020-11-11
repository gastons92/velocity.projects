package com.mycompany.velocity_calc;

import java.util.ArrayList;
import spark.Request;
import spark.Response;
import spark.Route;
import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
/**
 *
 * @author Gaston
 */
public class Controlador {
    
    public static Route calculadora = (Request request, Response response) -> {
        double resultado = 0;
        
        HashMap model = new HashMap();
        model.put("resultado", resultado);
        model.put("template", "templates/calculadora.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    
    public static Route none = (Request request, Response response) -> {
        String num1 = request.queryParams("a");
        String num2 = request.queryParams("b");
        
        double resultado = Double.parseDouble(num2);
        
        HashMap model = new HashMap();
        model.put("resultado", resultado);
        model.put("template", "templates/calculadora.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    
    public static Route getSuma = (Request request, Response response) -> {
        String num1 = request.queryParams("a");
        String num2 = request.queryParams("b");
        
        CalculadoraDAO calc = new CalculadoraDAO();
        double resultado = calc.sumar(num1, num2);
        
        HashMap model = new HashMap();
        model.put("resultado", resultado);
        model.put("template", "templates/calculadora.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    
    public static Route getResta = (Request request, Response response) -> {
        String num1 = request.queryParams("a");
        String num2 = request.queryParams("b");
        
        CalculadoraDAO calc = new CalculadoraDAO();
        double resultado = calc.restar(num1, num2);
        
        HashMap model = new HashMap();
        model.put("resultado", resultado);
        model.put("template", "templates/calculadora.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    
    public static Route getProducto = (Request request, Response response) -> {
        String num1 = request.queryParams("a");
        String num2 = request.queryParams("b");
        
        CalculadoraDAO calc = new CalculadoraDAO();
        double resultado = calc.multiplicar(num1, num2);
        
        HashMap model = new HashMap();
        model.put("resultado", resultado);
        model.put("template", "templates/calculadora.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    
    public static Route getCociente = (Request request, Response response) -> {
        String num1 = request.queryParams("a");
        String num2 = request.queryParams("b");
        
        CalculadoraDAO calc = new CalculadoraDAO();
        double resultado = calc.dividir(num1, num2);
        
        HashMap model = new HashMap();
        model.put("resultado", resultado);
        model.put("template", "templates/calculadora.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
}
