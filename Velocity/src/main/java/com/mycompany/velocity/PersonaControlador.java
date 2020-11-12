package com.mycompany.velocity;

import spark.Request;
import spark.Response;
import spark.Route;
import java.util.List;

import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class PersonaControlador {
    
    public static Route index = (Request req, Response res) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/index.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
    
    public static Route getPersonas = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p =  pDAO.getPersonas();
        
        HashMap model = new HashMap();
        model.put("personas", p);
        model.put("template", "templates/personas.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
               
    public static Route getHijos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        System.out.printf(" Nombre " + nbre);
        List<Persona> hijos = pDAO.getHijos(nbre);
        
        HashMap model = new HashMap();
        model.put("hijos", hijos);
        model.put("nombre", nbre);
        model.put("template", "templates/hijos.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    } ;
      
    public static Route getNietos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        System.out.printf(" Nombre " + nbre);
        List<Persona> nietos = pDAO.getNietos(nbre);
        
        HashMap model = new HashMap();
        model.put("nietos", nietos);
        model.put("nombre", nbre);
        model.put("template", "templates/nietos.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    } ;   
    
    public static Route getPadres = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        System.out.printf(" Nombre " + nbre);
        List<Persona> padres = pDAO.getPadres(nbre);
        
        HashMap model = new HashMap();
        model.put("padres", padres);
        model.put("nombre", nbre);
        model.put("template", "templates/padres.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    } ; 
    
    public static Route getHermanos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        System.out.printf(" Nombre " + nbre);
        List<Persona> hermanos = pDAO.getHermanos(nbre);
        
        HashMap model = new HashMap();
        model.put("hermanos", hermanos);
        model.put("nombre", nbre);
        model.put("template", "templates/hermanos.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    } ; 
    
    public static Route getTios = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        System.out.printf(" Nombre " + nbre);
        List<Persona> tios = pDAO.getTios(nbre);
        
        HashMap model = new HashMap();
        model.put("tios", tios);
        model.put("nombre", nbre);
        model.put("template", "templates/tios.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    } ; 
    
    public static Route getSobrinos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        System.out.printf(" Nombre " + nbre);
        List<Persona> sobrinos = pDAO.getSobrinos(nbre);
        
        HashMap model = new HashMap();
        model.put("sobrinos", sobrinos);
        model.put("nombre", nbre);
        model.put("template", "templates/sobrinos.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    } ; 
}

