package com.mycompany.spark2_ej1;

import java.util.ArrayList;
import java.util.Collections;
import lombok.Data;

@Data
public class ListaDAO {
    private ArrayList<Integer> numeros;
    
    public ArrayList<Integer> getLista(String s0, String s1, String s2, String s3, String s4, String s5, String b){
        numeros = new ArrayList<Integer>();
        
        if(s0==null && s1==null && s2==null && s3==null && s4==null && s5==null)
            return numeros;
        
        //Como permito saltear campos?
        //if(s0 != null)
        numeros.add(Integer.parseInt(s0));
        
        //if(s1 != null)
        numeros.add(Integer.parseInt(s1));

        //if(s2 != null)
        numeros.add(Integer.parseInt(s2));

        //if(s3 != null)
        numeros.add(Integer.parseInt(s3));

        //if(s4 != null)
        numeros.add(Integer.parseInt(s4));

        //if(s5 != null)
        numeros.add(Integer.parseInt(s5));
        
        if(b.equals("Ordenar"))
            Collections.sort(numeros);
        if(b.equals("Desordenar"))
            Collections.shuffle(numeros);

        return numeros;
    }
}
