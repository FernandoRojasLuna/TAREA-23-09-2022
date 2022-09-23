package com.example.tarea22_09_2022;

import java.util.Scanner;

public class ARREGLO_eliminarElemento {

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

        //ELIMINAR UN DATO DEL ARREGLO
        System.out.println("Ingrese el dato a eliminar: ");
        int numEliminar = entrada.nextInt();
        boolean eliminado = false;

        for(int i=0; i<arregloNumeros.length;i++){
            if (arregloNumeros[i]==numEliminar){
                arregloNumeros[i]=0;
                eliminado= true;
                System.out.println("Numero eliminado con exito");
                break;
            }
        }

        if (eliminado == false){
            System.out.println("El numero "+numEliminar+" no existe en el arreglo");
        }

        // VISUALIZAR ARREGLO

        System.out.println("Los datos del arreglo son: ");
        for(int i=0;i<arregloNumeros.length;i++) {
            System.out.print(arregloNumeros[i]+" ");
        }

    }

}

