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
    public  void push (int valor){
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
    //Método para mosntrar
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
            tamaño--;
        }
        else
            System.out.println("La pila esta vacía");
    }

}

