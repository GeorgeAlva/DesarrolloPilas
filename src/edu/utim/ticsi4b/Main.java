package edu.utim.ticsi4b;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pilas p = new Pilas();
        p.push(2);
        p.push(8);
        p.push(1);
        p.peek();
        System.out.println("El tamaño de la pila es de: "+p.getTamaño());
        p.cima();
        p.pop();
        p.peek();
        System.out.println("El tamaño de la pila es de: "+p.getTamaño());
        p.pop();
        System.out.println("El tamaño de la pila es de: "+p.getTamaño());
        p.cima();
        p.pop();
        System.out.println("El tamaño de la pila es de: "+p.getTamaño());
        p.peek();

    }
}
