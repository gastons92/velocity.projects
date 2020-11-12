package com.mycompany.spark2_ej1;

public class ListaDAO {
    double peso,altura;
    float imc;
        
    public float getLista(double peso, double altura, String b){
        
        if(peso==0 && altura!=0)
            return imc=0;
        
        if(b.equals("Obtener IMC"))
            imc=imc(peso,altura);
            
        return imc;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }    
    public float imc( double peso, double altura){
       altura= altura/100;
       return (float) (peso/(altura*altura));
    }
    public String tipo(float indice){
        if(indice<16.00){
         return("infrapeso: delgadez severa");
        }
        if(indice>= 16.00 && indice<=18.50){
         return("infrapeso: delfadez moderada");
        }
        if(indice>=18.50 && indice<25){
          return("peso normal");
        }
        if(indice>=25 && indice<29.99){
          return("sobrepeso");
        }
        if(indice>=30 && indice<34.99){
         return("Obeso: tipo I");
        }
        if(indice>=35 && indice<40){
         return("Obeso: tipo II");
        }
        if(indice>=40){
         return("Obeso: tipo III");
        }
      return("Fuera de rango");
    }
}
