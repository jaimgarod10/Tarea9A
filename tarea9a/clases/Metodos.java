/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea9a.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimg
 */
public class Metodos {
    
    ArrayList<Clientes> listClientes = new ArrayList();
    
    public Clientes crearCliente() {

        Clientes cliente = new Clientes(JOptionPane.showInputDialog("DNI: "), JOptionPane.showInputDialog("Nombre del cliente: "), JOptionPane.showInputDialog("Telefono: "),JOptionPane.showInputDialog("Dirección: "), Double.parseDouble(JOptionPane.showInputDialog("Dueda: ")));
        System.out.println("Cliente creado. ");
        return cliente;
    }

    public void mostrar(ArrayList<Clientes> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("Error. El ArrayList está vacío");

        } else {
            System.out.println("Mostrar :");
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void consultarCliente(ArrayList<Clientes> lista) {

        if (lista.isEmpty()) {
            throw new NullPointerException("Error. El ArrayList está vacío. ");

        } else {
            String DNI = JOptionPane.showInputDialog("Introduce el DNI del cliente: ");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getDNI().equals(DNI)) {
                    System.out.println("El cliente buscado es: \n" + lista.get(i));
                }
            }

        }
    }

    public void verLista(ArrayList<Clientes> lista){
        
        ListIterator iterador;
        iterador = lista.listIterator();
        while(iterador.hasNext()){
            Clientes cliente = (Clientes) iterador.next();
            System.out.print("cliente:" + cliente.getNombre());
            System.out.print(", DNi:" + cliente.getDNI());
            System.out.print(", dirección:" + cliente.getDireccion());
          System.out.print(", tlf.:" + cliente.getTelefono());
        System.out.print(", deuda:" + cliente.getDeuda() + "\n");
        }
    }
    
    public List borrarCliente(ArrayList<Clientes> lista){
        
        ListIterator iterador;
        boolean encontrado = false;
        iterador = lista.listIterator();
        String DNI = null;
        while(iterador.hasNext()){
            Clientes cliente = (Clientes) iterador.next();
            DNI = JOptionPane.showInputDialog("Introduce el DNI del cliente: ");
            if (cliente.getDNI().equals(DNI)){
                System.out.println("Se han encontrado los datos del DNI " + DNI);
                System.out.print("cliente:" + cliente.getNombre());
                System.out.print(", dirección:" + cliente.getDireccion());
                System.out.print(", tlf.:" + cliente.getTelefono());
                System.out.print(", deuda:" + cliente.getDeuda() + "\n");
                iterador.remove();
                System.out.println("Registro borrado. ");
                encontrado = true;
            }   
        }
        if (!encontrado){
            System.out.println("No se ha encontrado el DNI " + DNI);
        }
        return lista;
    }

    public void salir(){
        System.exit(0);
    }

}


