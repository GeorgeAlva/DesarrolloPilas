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
        }
        else
            System.out.println("La pila esta vacía");
    }

}

