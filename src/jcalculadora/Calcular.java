package jcalculadora;

/**
 *
 * @author mazurco066
 */
public class Calcular {
    
    private double v1;
    private double v2;
    
    public Calcular(double valor1, double valor2){
        
        this.v1 = valor1;
        this.v2 = valor2;
    }
    
    public double somar(){
        
        double resultado;
        resultado = v1 + v2;
        return resultado;
    }
    
    public double subtrair(){
        
        double resultado;
        resultado = v1 - v2;
        return resultado;
    }
    
    public double dividir(){
        
        double resultado;
        
        if (v2 != 0){
            resultado = v1 / v2;
        }
        else{
            resultado = 0;
        }
        return resultado;
    }
    
    public double multiplicar(){
        
        double resultado;
        resultado = v1 * v2;
        return resultado;
    }
    
}
  
