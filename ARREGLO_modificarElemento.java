package com.example.tarea22_09_2022;

import java.util.Scanner;

public class ARREGLO_modificarElemento {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Los datos del arreglo son: ");
        int tamañoArreglo= entrada.nextInt();

        int[] arregloNumeros = new int[tamañoArreglo];

        for(int i=0;i<arregloNumeros.length;i++){
            System.out.println("Ingresa el dato a guardar en la posicion "+(i+1));
            arregloNumeros[i]=entrada.nextInt();
        }
        // VISUALIZAR ARREGLO

        System.out.println("Los datos del arreglo son: ");
        for(int i=0;i<arregloNumeros.length;i++) {
            System.out.print(arregloNumeros[i]+" ");
        }
        System.out.println();

        //MODIFICAR UN DATO DEL ARREGLO
        System.out.println("Ingrese el dato a modificar: ");
        int numModificar = entrada.nextInt();
        boolean modificado = false;

        for(int i=0; i<arregloNumeros.length;i++){
            if (arregloNumeros[i]==numModificar){
                System.out.println("Ingrese el numero a remplazar al numero "+arregloNumeros[i]);
                arregloNumeros[i]=entrada.nextInt();
                modificado=true;
                System.out.println("Numero modificado con exito");
                break;
            }
        }

        if (modificado == false){
            System.out.println("El numero "+numModificar+" no existe en el arreglo");
        }

        // VISUALIZAR ARREGLO

        System.out.println("Los datos del arreglo son: ");
        for(int i=0;i<arregloNumeros.length;i++) {
            System.out.print(arregloNumeros[i]+" ");
        }

    }

}
