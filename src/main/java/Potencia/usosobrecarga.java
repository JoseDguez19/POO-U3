package Potencia;



/**
 *
 * @author itzaFc
 */
public class usosobrecarga {
    public static void main (String[]args){
        Potencia p = new Potencia();
        System.out.println("Llamado al metodo cuadrado para enteros"+p.cuadrado(7));
        System.out.println("Llamado al metodo cuadrado para float"+p.cuadrado(7.5f));
        System.out.println("Llamado al metodo cuadrado para double"+p.cuadrado(7.5));
        System.out.println("Llamado al metodo cuadrado para enteroes"+p.potencia(2,3));
    }
    
}
