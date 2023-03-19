/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author ap550
 */
public class UsoSobrecarga {
    public static void main(String[] args) {
        Sobrecarga sb = new Sobrecarga();
        System.out.println("Llamando al metodo cuadrado para enteros: "+sb.cuadrado(7));
        System.out.println("Llamando al metodo cuadrado para float: "+sb.cuadrado(7.5f));
        System.out.println("Llamando al metodo cuadrado para double: "+sb.cuadrado(7.5));
    }
}
