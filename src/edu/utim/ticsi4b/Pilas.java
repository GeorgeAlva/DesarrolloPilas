package edu.utim.ticsi4b;

/**
 * Created by Ulises on 08/11/2017.
 */
public class Pilas {
    private Nodo top;
    private int tamaño;
    public  Pilas(){
        top = null;
        tamaño = 0;
    }

    public int getTamaño() {return tamaño;}
    public boolean vacia(){
        return (top== null);
    }
//Método buscar por índice
    public void buscarIndice(int indice){
        if(!vacia()) {//Si la pila no es vacía entra al índice
            Nodo temp = top;//Crea una copia de la pila por una auxiliar temporal
            if (indice >= 0 && indice <= tamaño) {//Si el índice se encuentra entre el tamaño de la pila entra al if
                for (int i = 0; i < indice; i++) {//Mientras el valor del índice se encuentre en la pila hace el for
                    temp=temp.getProx( );//Avanza de posicion en la pila
                }
                System.out.println("El indice " + indice + " es igual a :");
                System.out.println(temp.getValor( ));//Representa el último valor encontrado en el auxiliar
            } else System.out.println("Ese indice no se encuentra dentro de la pila");
        }else
            System.out.println("La pila no tiene valores");
    }

    //Método parea insertar
    public  void Push (int valor){
        Nodo nuevoNodo;
        if(vacia())
            top= new Nodo (valor);
        else {
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
        tamaño++;
    }
    //Método para mostrar
    public  void  Peek (){
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
    public  void Cima(){//buscar
        if(!vacia())
            System.out.println("Cima: "+top.getValor());
        else
            System.out.println("La pila está vacía");
    }
    //Método para borrar

    public  void Pop(){
        if (!vacia()){//extraer

            System.out.println("Dato extraido: "+top.getValor());
            top = top.getProx();
            tamaño--;
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

