/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estacionamiento;

/**
 *
 * @author ap550
 */
public class UsoEstacionamiento {
    public static void main(String[] args) {
        Estacionamiento auto1 = new Estacionamiento();
        System.out.println("Total a pagar: "+auto1.CalcularCargos(3));
    }
}
