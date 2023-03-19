package Potencia;




/**
 *
 * @author itzaFc
 */
public class Potencia {
    public int cuadrado (int valor){
        return valor * valor ;
    }
   public float cuadrado (float valor){
       return valor*valor ;
   }
   public double cuadrado (double valor){
       return valor * valor;
   }
public int potencia (int base, int exponente ){
    int resultado = 1 ;
    if (exponente>1){
        for (int i = 1 ; i<= exponente; i++){
            resultado = resultado * base;
            
        }  
    }else if (exponente== 1 ){
        resultado = base;
    }
    if(exponente == 0 ){
        resultado=1;
    }
    return resultado;

}
}


