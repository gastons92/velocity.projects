package com.mycompany.velocity_calc;

import lombok.Data;
/**
 *
 * @author Gaston
 */

@Data
public class CalculadoraDAO {
    double resultado;
    
    public double sumar(String numero1, String numero2){
        resultado = 0;
        
        if(numero1 == null || numero2 == null)
            return resultado;
        
        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);
        
        Calculadora calc = new Calculadora();
        resultado = calc.sumar(n1, n2);
        
        return resultado;
    }
    
    public double restar(String numero1, String numero2){
        resultado = 0;
        
        if(numero1 == null || numero2 == null)
            return resultado;
        
        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);
        
        Calculadora calc = new Calculadora();
        resultado = calc.restar(n1, n2);
        
        return resultado;
    }
    
    public double multiplicar(String numero1, String numero2){
        resultado = 0;
        
        if(numero1 == null || numero2 == null)
            return resultado;
        
        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);
        
        Calculadora calc = new Calculadora();
        resultado = calc.multiplicar(n1, n2);
        
        return resultado;
    }
    
    public double dividir(String numero1, String numero2){
        resultado = 0;
        
        if(numero1 == null || numero2 == null)
            return resultado;
        
        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);
        
        Calculadora calc = new Calculadora();
        resultado = calc.dividir(n1, n2);
        
        return resultado;
    }
}