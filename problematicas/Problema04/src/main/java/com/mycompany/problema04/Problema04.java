/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema04;

/**
 *
 * @author Usuario Win11
 */
public class Problema04 {

    public static void main(String[] args) {
        int numerador = 1;
        int denominador = 1;
        String cadena = "";
        int contador = 1;
        
        while(denominador <= 15){
            if (contador %2 == 1){
                cadena = String.format("%s + %d/%d ", 
                        cadena,
                        numerador,
                        denominador);
            }else{
                cadena = String.format("%s - %d/%d ",
                        cadena,
                        numerador,
                        denominador);
                
                
            }
            denominador = denominador + 2;
            contador = contador + 1;
        }
        System.out.printf("%s\n", cadena);
        }
        
         
    }
    

