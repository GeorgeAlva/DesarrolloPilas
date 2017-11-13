package edu.utim.ticsi4b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pilas pilas = new Pilas();
        Scanner sc = new Scanner(System.in);
        int opcion;//Se coloca fuera del do por que se ocupa en el while, que esta fuera de este.
        do {//Mientras la opción no sea 8 el programa repetirá esta estructura
            System.out.println("::::::::::Menú::::::::::");
            System.out.println(" [1] Insertar \n [2] Mostrar \n [3] Buscar \n [4] Eliminar \n [5] Tamaño \n [6] Máximo \n [7] Mínimo \n [8] Terminar ");
            System.out.println("Ingrese la opción que desea: ");
            opcion = sc.nextInt();//Opción a escoger por el usuario
            switch (opcion) {
                case 1:

                        System.out.println("Teclee el elemento ");
                        int valor = sc.nextInt();
                        pilas.Push(valor);//Allí se inserta el valor proporcionado por el usuario
                    break;
                case 2:
                    pilas.Peek();//Invoca al método dado por el usuario
                    break;
                case 3:
                    boolean valido=false;//Mientras el usuario no digite una opción válida se repetirá este ciclo
                    while (!valido) {
                        System.out.println("Desea buscar el valor por Índice o solo la cima");
                        System.out.println("1: Por Índice 2: La cima");
                        System.out.println("¿Cúal es tu opción?: ");
                        int decision = sc.nextInt( );
                        if (decision == 1) {
                            System.out.println("Ingrese el índice que desea buscar: ");
                            int indice = sc.nextInt( );
                            pilas.buscarIndice(indice);//Invoca el método índice
                            valido = true;
                            break;
                        }
                        if (decision == 2) {
                            pilas.Cima( );//Manda a traer el valor cima de nuestra pila si esta tiene valores
                            valido = true;break;
                        } else  System.out.println("Ingrese una opción númerica entre 1-2");    }
                    break;
                case 4:
                    pilas.Pop();//Extrae el último valor de la pila, ya que una pila siempre el último que ingresa debe ser el primero en salir
                    break;
                case 5:
                    System.out.println("El tamaño de la pila es de: "+pilas.getTamaño());
                    break;
                case 6:
                    pilas.Maxi();
                    break;
                case 7:
                    pilas.Mini();
                    break;
                case 8:
                    System.out.println("Usted ha salido del programa");
                    break;
                default:
                    System.out.println("Esa opción no es válida");
            }
        }while (opcion!=8);//Si el usuario digita 8 sale del ciclo
    }


}

