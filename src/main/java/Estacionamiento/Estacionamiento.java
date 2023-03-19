/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Estacionamiento;

/**
 *
 * @author ap550
 */
public class Estacionamiento {

    final float CuotaMinima = 2.0f;
    final float CargoMaximo = 10.0f;
    final float CostoExedente = 0.50f;
    final int HoraBase = 3;
    
    public float CalcularCargos(float Hr){
        float HrExtras=0;
        float Fraccion=0;
        float Cargos=0;
        int HrEntera=0;
        
        if (Hr>HoraBase){
            HrExtras=Hr - HoraBase;
            HrEntera= (int)Hr - HoraBase;
            Fraccion = HrExtras - HrEntera;
            System.out.println("Horas totales: "+Hr);
            System.out.println("Horas base: "+HoraBase);
            System.out.println("Horas exedentes: "+HrExtras);
            Cargos = CuotaMinima + (HrEntera * CostoExedente);
            
            if(Fraccion>0){
                Cargos = Cargos + CostoExedente;
            }
         } else{
            System.out.println("No hay cargos.");
            Cargos = CuotaMinima;
        }
        if (Cargos>CargoMaximo){
            Cargos= CargoMaximo; 
        }
        return Cargos;
    }
}
