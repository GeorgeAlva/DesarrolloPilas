package edu.utim.ticsi4b;

/**
 * Created by Ulises on 08/11/2017.
 */
public class Pilas {
    private Nodo top;

    public  Pilas(){
        top = null;
    }
    public boolean vacia(){
        return (top== null);
    }
//Método parea insertar
    public  void push (int valor){
        Nodo nuevoNodo;
        if(vacia())
            top= new Nodo (valor);
        else {
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }
    //Método para mostrar
    public  void  peek (){
        Nodo temp = top;
        if(temp!=null){
            System.out.println("La pila es: ");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }
        else
            System.out.println("PILA VACÍA");
    }
    //Método buscar
    public  void cima(){//buscar
        if(!vacia())
            System.out.println("Cima: "+top.getValor());
        else
            System.out.println("La pila está vacía");
    }
    //Método para borrar

    public  void pop(){
        if (!vacia()){//extraer

            System.out.println("Dato extraido: "+top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacía");
    }
    //Método para obtener el valor máximo
    public void Maxi() {
        Nodo temp = top; //Crea una copia de la pila
        int Max = temp.getValor(); //Variable de tipo int con valor en la primer posición de la pila
        if (temp != null) { //condición para saber si la pila no está vacía
            while (temp != null) { //ciclo para recorrer la pila
                if (Max < temp.getValor()) { //condicion para comparar valor de la pocisión con el valor de la variable
                    Max = temp.getValor(); // asignación del menor valor a la variable
                }
                temp = temp.getProx(); //siguinete posición de la pila
            }
            System.out.println("El valor máximo es: " + Max); //imprime el valor guardado en la variable
        } else {
            System.out.println("La pila esta vacia"); //imprime la pila está vacía
        }
    }
    //Método para obtener el valor mínimo
    public void Mini() {
        Nodo temp = top; //Crea una copia de la pila
        int Min = temp.getValor(); //Variable de tipo int con valor en la primer posición de la pila
        if (temp != null) { //condición para saber si la pila no está vacía
            while (temp != null) { //ciclo para recorrer la pila
                if (Min > temp.getValor()) { //condicion para comparar valor de la pocisión con el valor de la variable
                    Min = temp.getValor(); // asignación del menor valor a la variable
                }
                temp = temp.getProx(); //siguinete posición de la pila
            }
            System.out.println("El valor mínimo es: " + Min); //imprime el valor guardado en la variable
        } else {
            System.out.println("La pila esta vacia"); //imprime la pila está vacía
        }
    }
}

