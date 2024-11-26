/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario Win11
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaReporte = "";
        String listaEdad = "";
        String promedioTodo = "";
        
        String nombreJugador;
        String posicionCampo;
        
        int edad;
        double estatura;
        boolean bandera = true;
        String salir;
        
        int sumaEdades = 0;
        double sumaEstaturas = 0;
        int iteraciones = 0;
        
        double promedioEdad;
        double promedioEstatura;
        
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
        "Listado de jugadores\n");
        
        listaEdad = String.format("%s%s\n",listaEdad,
                "Listado de edades\n");
        
                
        while(bandera){
            System.out.println("Ingrese el nombre del jugador");
            nombreJugador = entrada.nextLine();
                                 
            System.out.println("Ingrese la posicion del jugador");
            posicionCampo = entrada.nextLine();
            
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            
            iteraciones = iteraciones + 1;
            
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d, estatura %.2f"
                    + "\n",
                    cadenaReporte,
                    iteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);
            
            listaEdad = String.format("%s%d\n", listaEdad,edad);
            
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
                    
            System.out.println("Desea salir del ciclo digite: si");
            entrada.nextLine();
            salir = entrada.nextLine();
                if (salir.equals("si")){
                    bandera = false;
                }
        }
        promedioEdad = sumaEdades / iteraciones;
        promedioEstatura = sumaEstaturas / iteraciones;
        
        promedioTodo = String.format("%s\nPromedio de edades: %.1f\n"
                + "Promedio de estaturas:%.2f\n",
                promedioTodo,
                promedioEdad,
                promedioEstatura);
                 
        System.out.printf("%s\n%s\n%s\n", cadenaReporte, listaEdad, promedioTodo);
    }
}
