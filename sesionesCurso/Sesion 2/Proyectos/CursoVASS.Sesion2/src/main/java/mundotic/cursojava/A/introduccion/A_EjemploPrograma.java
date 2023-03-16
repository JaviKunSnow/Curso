/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.A.introduccion;

/**
 *
 * @author Javi
 * 
 * 
 */

public class A_EjemploPrograma {    
    //Nodo de lista
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //primer nodo y ultimo nodo de la lista  
    public Node head = null;    
    public Node tail = null;    
        
    //metodo añadir nodo 
    public void addNode(int data) {    
        //Crear Nodo   
        Node newNode = new Node(data);    
            
        //Comprobar si la lista esta vacia   
        if(head == null) {    
            //Si la lista esta vacia apuntamos los dos primero y ultimo a ese nodo   
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //si no esta vacia cambiamos la cola para que apunte al nuevo nodo  
            tail.next = newNode;    
            //y apuntamos la cola al nuevo nodo  
            tail = newNode;    
        }    
    }    
        
    //recorre la lista y muestra sus valores  
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Por cada iteracion desplazamos el puntero    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        A_EjemploPrograma sList = new A_EjemploPrograma();    
            
        //Añadimos nodos a la lista    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
        //Mostramos los valores de la lista 
        sList.display();    
    }    
}  


