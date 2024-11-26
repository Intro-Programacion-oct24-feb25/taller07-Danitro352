/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema02;

/**
 *
 * @author Usuario Win11
 */
public class Problema02 {

    public static void main(String[] args) {
       int numero = 2;
        int incremento = 4; 
        int contador = 1; 

        while (contador <= 10) {
            System.out.println(numero); 
            numero = numero + incremento; 
            incremento = incremento + 2; 
            contador = contador + 1; 
        }
    }
}
