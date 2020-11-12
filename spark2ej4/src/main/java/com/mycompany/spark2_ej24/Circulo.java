/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spark2_ej24;

/**
 *
 * @author Dario
 */
public class Circulo {
    private float perimetro,area;
    double  radio;
    public double getRadio(){
        return radio;
    }
    public void setPerimetro(double radio){
        perimetro=(float) (2 * radio * Math.PI);
    }
    public void setArea(double radio){
        area=(float) (radio * radio * Math.PI);
    }
    public float getPerimetro(){
        return perimetro ;
    }
    public float getArea(){
        return area;
    }
    public Circulo getCirculo(double radio, String btn ){
        
        Circulo c=new Circulo();
        
        if(radio>0 && btn.equals("Obtener Circulo")){
            setArea(radio);
            setPerimetro(radio);
        }
        return c;
    }
}
