package com.mycompany.velocity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class PersonaDAO {
    private List<Persona> personas;
    
        public List<Persona> getPersonas(){
        init();
        return personas;
        }

        public List<Persona> getHijos(String nombre){
            init();
            List<Persona> hijos;
            hijos = new ArrayList<Persona>(); 
            
            if(nombre == null)  //Muestra formulario para ingresar nombre
                return hijos;   //sin necesidad de pasarlo por parametro
            //para que funcione la consulta http://localhost:4567/getHijos
            
            Persona pEncontrada = personas.stream()
                .filter(p -> nombre.equals(p.getNombre()))
                .findAny()
                .orElse(null);
                if (pEncontrada != null ) { 
                   hijos.addAll(pEncontrada.getHijos());
                }
            return hijos; 
        } 
                
        public List<Persona> getNietos(String nombre){
            init();
            List<Persona> nietos;
            nietos = new ArrayList<Persona>(); 
            
            if(nombre == null)  //Muestra formulario para ingresar nombre
                return nietos;   //sin necesidad de pasarlo por parametro
            //para que funcione la consulta http://localhost:4567/getNietos
            
            Persona pEncontrada = personas.stream()
                .filter(p -> nombre.equals(p.getNombre()))
                .findAny()
                .orElse(null);
                if (pEncontrada != null) { 
                    pEncontrada.getHijos().forEach(persona ->
                    { nietos.addAll(persona.getHijos());} );
                }
            return nietos; 
        } 
        
        public List<Persona> getPadres(String nombre){
            init();
            List<Persona> padres;
            padres = new ArrayList<Persona>(); 
            
            if(nombre == null)  //Muestra formulario para ingresar nombre
                return padres;   //sin necesidad de pasarlo por parametro
            //para que funcione la consulta http://localhost:4567/getNietos
            
            for(Persona p: personas)
                for(Persona hijo: p.getHijos())
                    if(nombre.equals(hijo.getNombre()))
                        padres.add(p);
            return padres; 
        } 
        
        public List<Persona> getHermanos(String nombre){
            init();
            List<Persona> hermanos;
            hermanos = new ArrayList<Persona>(); 
            
            if(nombre == null)  //Muestra formulario para ingresar nombre
                return hermanos;   //sin necesidad de pasarlo por parametro
            //para que funcione la consulta http://localhost:4567/getNietos
            
            List<Persona> padres = this.getPadres(nombre);
            
            for(Persona padre: padres){
                List<Persona> h = this.getHijos(padre.getNombre());
                    for(Persona hermano : h){
                        if(!hermanos.contains(hermano) && !hermano.getNombre().equals(nombre))
                            hermanos.add(hermano);
                    }
            }
            
            return hermanos; 
        } 
        
        public List<Persona> getTios(String nombre){
            init();
            List<Persona> tios;
            tios = new ArrayList<Persona>(); 
            
            if(nombre == null)  //Muestra formulario para ingresar nombre
                return tios;   //sin necesidad de pasarlo por parametro
            //para que funcione la consulta http://localhost:4567/getNietos
            
            List<Persona> padres = this.getPadres(nombre);
            
            for(Persona padre: padres){
                List<Persona> t = this.getHermanos(padre.getNombre());
                    if(!tios.containsAll(t))
                        tios.addAll(t);
            }
            
            return tios; 
        } 
        
        public List<Persona> getSobrinos(String nombre){
            init();
            List<Persona> sobrinos;
            sobrinos = new ArrayList<Persona>();
            
            if(nombre == null)  //Muestra formulario para ingresar nombre
                return sobrinos;   //sin necesidad de pasarlo por parametro
            //para que funcione la consulta http://localhost:4567/getNietos
            
            List<Persona> hermanos = this.getHermanos(nombre);
            
            for(Persona h: hermanos){
                List<Persona> s = this.getHijos(h.getNombre());
                sobrinos.addAll(s);
            }
            return sobrinos; 
        }
        
        public void init(){
            personas = new ArrayList<Persona>();

            Persona pJuan = new Persona("JUAN","PEREZ");
            personas.add(pJuan);

            Persona pJuan1 = new Persona("GONZALO","PEREZ");   
            personas.add(pJuan1);
            pJuan1.addHijo(pJuan);
            
            Persona pJuan13 = new Persona("CARLOS","PEREZ");   
            personas.add(pJuan13);
            pJuan1.addHijo(pJuan13);
            
            Persona pJuan12 = new Persona("CRISTIAN","PEREZ");   
            personas.add(pJuan12);
            pJuan.addHijo(pJuan12);
            
            Persona pPedro = new Persona("PEDRO","DIAZ");   
            personas.add(pPedro);

            Persona pPedro1 = new Persona("RAUL","DIAZ");   
            personas.add(pPedro1);
            pPedro1.addHijo(pPedro);
        }
}

